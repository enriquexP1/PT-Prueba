package com.cyad.producciones.pdf;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.entity.EArticulo;
import com.cyad.producciones.entity.EAutor;
import com.cyad.producciones.entity.EConferenciaPresentacion;
import com.cyad.producciones.entity.EDesarrollo;
import com.cyad.producciones.entity.EDocumentoRespaldo;
import com.cyad.producciones.entity.EDocumentos_Reseñas;
import com.cyad.producciones.entity.EEditor;
import com.cyad.producciones.entity.EInnovacion;
import com.cyad.producciones.entity.EInstitucion;
import com.cyad.producciones.entity.ELibro;
import com.cyad.producciones.entity.EMemoria;
import com.cyad.producciones.entity.EOrden;
import com.cyad.producciones.entity.EOrigenReporte;
import com.cyad.producciones.entity.EProduccionAcademicaArticulo;
import com.cyad.producciones.entity.EProduccionAcademicaConferenciaPresentacion;
import com.cyad.producciones.entity.EProduccionAcademicaDesarrollo;
import com.cyad.producciones.entity.EProduccionAcademicaDocumentosReseña;
import com.cyad.producciones.entity.EProduccionAcademicaInnovacion;
import com.cyad.producciones.entity.EProduccionAcademicaLibro;
import com.cyad.producciones.entity.EProduccionAcademicaMemoria;
import com.cyad.producciones.entity.EProduccionAcademicaReporte;
import com.cyad.producciones.entity.EReporte;
import com.cyad.producciones.entity.ERevista;
import com.cyad.producciones.entity.ERolParticipacion;
import com.cyad.producciones.entity.ETipoDesarrollo;
import com.cyad.producciones.service.ArticuloPalabrasPuenteService;
import com.cyad.producciones.service.ArticuloService;
import com.cyad.producciones.service.AutorService;
import com.cyad.producciones.service.ConferenciaPresentacionService;
import com.cyad.producciones.service.DesarrolloService;
import com.cyad.producciones.service.DocumentoReseñaPalabrasPuenteService;
import com.cyad.producciones.service.DocumentoReseñaService;
import com.cyad.producciones.service.DocumentoRespaldoService;
import com.cyad.producciones.service.EditorService;
import com.cyad.producciones.service.InnovacionService;
import com.cyad.producciones.service.LibroPalabrasPuenteService;
import com.cyad.producciones.service.LibroService;
import com.cyad.producciones.service.MemoriaPalabrasPuenteService;
import com.cyad.producciones.service.MemoriaService;
import com.cyad.producciones.service.OrdenService;
import com.cyad.producciones.service.OrigenReporteService;
import com.cyad.producciones.service.PalabrasClaveService;
import com.cyad.producciones.service.ProduccionAcademicaArticuloService;
import com.cyad.producciones.service.ProduccionAcademicaConferenciaPresentacionService;
import com.cyad.producciones.service.ProduccionAcademicaDesarrolloService;
import com.cyad.producciones.service.ProduccionAcademicaDocumentoReseñaService;
import com.cyad.producciones.service.ProduccionAcademicaInnovacionService;
import com.cyad.producciones.service.ProduccionAcademicaLibroService;
import com.cyad.producciones.service.ProduccionAcademicaMemoriaService;
import com.cyad.producciones.service.ProduccionAcademicaReporteService;
import com.cyad.producciones.service.ReportePalabrasPuenteService;
import com.cyad.producciones.service.ReporteService;
import com.cyad.producciones.service.RevistasService;
import com.cyad.producciones.service.RolParticipacionService;
import com.cyad.producciones.service.TipoDesarrolloService;

/**
 * servicio de lectura de CV
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_reader")
public class Reader {
	ArrayList<String> palabras;

	@Autowired
	@Qualifier("servicio_articulo")
	ArticuloService servicio_articulos;

	@Autowired
	@Qualifier("servicio_revistas")
	RevistasService servicio_revista;

	@Autowired
	@Qualifier("servicio_palabras_clave")
	PalabrasClaveService servicio_palabras_clave;

	@Autowired
	@Qualifier("servicio_articulo_palabras_puente")
	ArticuloPalabrasPuenteService servicio_articulo_palabras_puente;

	@Autowired
	@Qualifier("servicio_libro")
	LibroService servicio_libro;

	@Autowired
	@Qualifier("servicio_reporte")
	ReporteService servicio_reporte;

	@Autowired
	@Qualifier("servicio_instituciones")
	com.cyad.producciones.service.InstitucionService servicio_institucion;

	@Autowired
	@Qualifier("servicio_origen_reporte")
	OrigenReporteService servicio_origen_reporte;

	@Autowired
	@Qualifier("servicio_memoria")
	MemoriaService servicio_memoria;

	@Autowired
	@Qualifier("servicio_innovacion")
	InnovacionService servicio_innovacion;

	@Autowired
	@Qualifier("servicio_documento_reseña")
	DocumentoReseñaService servicio_documento_reseña;

	@Autowired
	@Qualifier("servicio_desarrollo")
	DesarrolloService servicio_desarrollo;

	@Autowired
	@Qualifier("servicio_conferencia_presentacion")
	ConferenciaPresentacionService servicio_conferencia_presentacion;

	@Autowired
	@Qualifier("servicio_rol_participacion")
	RolParticipacionService servicio_rol_participacion;

	@Autowired
	@Qualifier("servicio_tipo_desarrollo")
	TipoDesarrolloService servicio_tipo_desarrollo;

	@Autowired
	@Qualifier("servicio_documento_respaldo")
	DocumentoRespaldoService servicio_documento_respaldo;

	@Autowired
	@Qualifier("servicio_libro_palabras_puente")
	LibroPalabrasPuenteService servicio_libro_palabras_puente;

	@Autowired
	@Qualifier("servicio_memoria_palabras_puente")
	MemoriaPalabrasPuenteService servicio_memoria_palabras_puente;

	@Autowired
	@Qualifier("servicio_reporte_palabras_puente")
	ReportePalabrasPuenteService servicio_reporte_palabras_puente;

	@Autowired
	@Qualifier("servicio_documento_reseña_palabras_puente")
	DocumentoReseñaPalabrasPuenteService servicio_documentos_reseña_palabras_puente;

	@Autowired
	@Qualifier("servicio_autor")
	AutorService servicio_autor;

	@Autowired
	@Qualifier("servicio_editor")
	EditorService servicio_editor;

	@Autowired
	@Qualifier("servicio_orden")
	OrdenService servicio_orden;

	@Autowired
	@Qualifier("servicio_produccion_academica_articulo")
	ProduccionAcademicaArticuloService servicio_produccion_academica_articulo;

	@Autowired
	@Qualifier("servicio_produccion_academica_libro")
	ProduccionAcademicaLibroService servicio_produccion_academica_libro;

	@Autowired
	@Qualifier("servicio_produccion_academica_innovacion")
	ProduccionAcademicaInnovacionService servicio_produccion_academica_innovacion;

	@Autowired
	@Qualifier("servicio_produccion_academica_desarrollo")
	ProduccionAcademicaDesarrolloService servicio_produccion_academica_desarrollo;

	@Autowired
	@Qualifier("servicio_produccion_academica_reporte")
	ProduccionAcademicaReporteService servicio_produccion_academica_reporte;

	@Autowired
	@Qualifier("servicio_produccion_academica_documento_reseña")
	ProduccionAcademicaDocumentoReseñaService servicio_produccion_academica_documento_reseña;

	@Autowired
	@Qualifier("servicio_produccion_academica_memoria")
	ProduccionAcademicaMemoriaService servicio_produccion_academica_memoria;

	@Autowired
	@Qualifier("servicio_produccion_academica_conferencia_presentacion")
	ProduccionAcademicaConferenciaPresentacionService servicio_produccion_academica_conferencia_presentacion;

	int posicionAutor = 0;
	int posicionEditor = 0;


	public Reader() {
		palabras = new ArrayList<String>();
	}

	public void leer(File archivo) {
		PDDocument document = null;
		try {
			document = PDDocument.load(archivo);
			PDFTextStripper pdfTextStripper = new PDFTextStripper();
			pdfTextStripper.setStartPage(0);
			String texto = pdfTextStripper.getText(document);
			StringTokenizer tokens = new StringTokenizer(texto);
			while (tokens.hasMoreElements()) {
				palabras.add(tokens.nextToken());
			}
			String nombre = null;
			String nombre2 = null;

			String apellidoP = null;
			String apellidoM = null;
			EAutor autor = new EAutor();
			for (int i = 0; i < palabras.size(); i++) {
				// para sacar el nombre de las persona en el CV
				if (palabras.get(i).equals("Alumno:")) {
					// por si tiene 2 nombres
					if (palabras.get(i + 5).equals("Directora:")) {
						nombre = palabras.get(i + 1);
						nombre2 = palabras.get(i + 2);
						apellidoP = palabras.get(i + 3);
						apellidoM = palabras.get(i + 4);
						System.out.println("Tiene 4 campos");
						nombre = nombre + " " + nombre2;
						System.out.println(nombre + " " + nombre2 + " " + apellidoP + " " + apellidoM);
						// por si tiene solo 1 nombre
					} else if (palabras.get(i + 4).equals("Directora:")) {
						nombre = palabras.get(i + 1);
						apellidoP = palabras.get(i + 2);
						apellidoM = palabras.get(i + 3);
						System.out.println(nombre + " " + apellidoP + " " + apellidoM);
					}

				}
				autor.setNombre(nombre);
				autor.setPrimerApellido(apellidoP);
				autor.setSegundoApellido(apellidoM);

				if (palabras.get(i).equals("ARTICULO")) {
					System.out.println("encontramos un articulo");
					int inicioArticulo = i;
					crearArticulo(inicioArticulo);

				}
				if (palabras.get(i).equals("LIBRO")) {
					System.out.println("encontramos un libro");
					int inicioLibro = i;
					crearLibro(inicioLibro);
				}
				if (palabras.get(i).equals("REPORTE")) {
					System.out.println("encontramos un reporte");
					int inicioReporte = i;
					crearReporte(inicioReporte);

				}
				if (palabras.get(i).equals("INNOVACION")) {
					System.out.println("encontramos una innovacion");
					int inicioInnovacion = i;
					crearInnovacion(inicioInnovacion);
				}
				if (palabras.get(i).equals("DESARROLLO_TECNOLOGICO")) {
					System.out.println("encontramos un desarrollo");
					int inicioDesarrollo = i;
					crearDesarrollo(inicioDesarrollo);
				}
				if (palabras.get(i).equals("MEMORIA")) {
					System.out.println("encontramos una memoria");
					int inicioMemoria = i;
					crearMemoria(inicioMemoria);
				}
				if (palabras.get(i).equals("DOCUMENTO_DE_TRABAJO")) {
					System.out.println("encontramos un documento");
					int inicioDocumento = i;
					crearDocumentoReseña(inicioDocumento, true);
				}
				if (palabras.get(i).equals("RESEÑA")) {
					System.out.println("encontramos una reseña");
					int inicioReseña = i;
					crearDocumentoReseña(inicioReseña, false);
				}
				if (palabras.get(i).equals("PRESENTACION_EN_EVENTO_ESPECIALIZADO")) {
					System.out.println("encontramos una presentacion");
					int inicioPresentacion = i;
					crearConferenciaPresentacion(inicioPresentacion, true, autor);
				}
				if (palabras.get(i).equals("CONFERENCIA_MAGISTRAL")) {
					System.out.println("encontramos una conferencia");
					int inicioConferencia = i;
					crearConferenciaPresentacion(inicioConferencia, false, autor);
				}

			}

		} catch (

		Exception e) {
			System.out.println("no se pudo leer el archivo");
		}
	}

	public void crearArticulo(int inicioArticulo) {
		//se crean los datos que lleva la producción académica 
		ERevista revista = new ERevista();
		EArticulo articulo = new EArticulo();
		int inicioTitulo = 0;
		int finalTitulo = 0;
		String titulo = null;
		String doi = null;
		int inicioRevista = 0;
		int finalRevista = 0;
		String revistaNombre = null;
		int numero = 0;
		int volumen = 0;
		String ISSN = null;
		String tipoISSN = null;
		SimpleDateFormat formato = new SimpleDateFormat("yyyy/dd/MM");
		Date fechaPublicacion = null;
		Date fechaAceptacion = null;
		int paginaInicial = 0;
		int paginaFinal = 0;
		String pais = null;
		String idioma = null;
		//
		int contadorAutores = 0;
		// primero tomamos los datos que necesitamos del archivo como titulo doi y etc
		// se toman a partir de las palabras clave
		for (int i = inicioArticulo; i < palabras.size(); i++) {
			if (palabras.get(i).equals("TITULO:")) {
				// en datos como el titulo que cuentan con mas palabras se toma el inicio del titulo  y al encontrar la siguiente palabra
				// se toma la posición anterior para delimitar el final del titulo.
				inicioTitulo = i + 1;
			}
			if (palabras.get(i).equals("DOI:")) {
				finalTitulo = i - 1;
				doi = palabras.get(i + 1);
			}
			if (palabras.get(i).equals("REVISTA:")) {
				inicioRevista = i + 1;
			}
			if (palabras.get(i).equals("NUMERO:")) {
				finalRevista = i - 1;
				numero = Integer.parseInt(palabras.get(i + 1));
			}
			if (palabras.get(i).equals("VOLUMEN:")) {
				volumen = Integer.parseInt(palabras.get(i + 1));
			}
			if (palabras.get(i).equals("ISSN:")) {
				ISSN = palabras.get(i + 1);
			}
			if (palabras.get(i).equals("TIPO_ISSN:")) {
				tipoISSN = palabras.get(i + 1);
			}
			if (palabras.get(i).equals("FECHA_DE_PUBLICACION:")) {
				try {
					fechaPublicacion = formato.parse(palabras.get(i + 1));
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
			if (palabras.get(i).equals("FECHA_DE_ACEPTACIÓN:")) {
				try {
					fechaAceptacion = formato.parse(palabras.get(i + 1));
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
			if (palabras.get(i).equals("PAGINA_INICIAL:")) {
				paginaInicial = Integer.parseInt(palabras.get(i + 1));
			}
			if (palabras.get(i).equals("PAGINA_FINAL:")) {
				paginaFinal = Integer.parseInt(palabras.get(i + 1));
			}
			if (palabras.get(i).equals("PAIS:")) {
				pais = palabras.get(i + 1);
			}
			if (palabras.get(i).equals("IDIOMA:")) {
				idioma = palabras.get(i + 1);
			}
			if (palabras.get(i).equals("AUTORES:")) {
				posicionAutor = i;
				// rompemos el cilo al encontrar la palabra autores y guardamos está posición
				break;
			}
		}
//con las variables que tenemos inicio y fin vamos concatenando cada palabra 
		StringBuilder builderTitulo = new StringBuilder();
		StringBuilder builderRevista = new StringBuilder();
		for (int i = inicioTitulo; i <= finalTitulo; i++) {
			builderTitulo.append(palabras.get(i) + " ");
		}
		for (int j = inicioRevista; j <= finalRevista; j++) {
			builderRevista.append(palabras.get(j) + " ");
		}
		titulo = builderTitulo.toString();
		revistaNombre = builderRevista.toString();
//asignamos al articulo los datos 
		revista.setIssn(ISSN);
		revista.setNombre(revistaNombre);
		revista.setNumero(numero);
		articulo.setRevista(revista);
		articulo.setDoi(doi);
		articulo.setTitulo(titulo);
		articulo.setFecha_aceptacion(fechaAceptacion);
		articulo.setFecha_publicacion(fechaPublicacion);
		articulo.setPagina_inicio(paginaInicial);
		articulo.setPagina_fin(paginaFinal);
		articulo.setPais(pais);
		articulo.setIdioma(idioma);
		servicio_revista.crear(revista);
		// creamos cada uno de los autores 
		if (servicio_articulos.crear(articulo) == true) {

			for (int i = posicionAutor; i < palabras.size(); i++) {
				if (palabras.get(i).equals("AUTOR:")) {
					EProduccionAcademicaArticulo produccionArticuloAux = new EProduccionAcademicaArticulo();
					EAutor autorAux = new EAutor();
					EOrden orden = new EOrden();
					contadorAutores++;
					orden.setId(contadorAutores);
					// limpiamos el nombre de los guiones bajos
					String cadena = palabras.get(i + 1);
					cadena = cadena.replace("_", " ");
					StringTokenizer tk = new StringTokenizer(cadena);
					if (tk.countTokens() == 3) {
						autorAux.setNombre(tk.nextToken());
						autorAux.setPrimerApellido(tk.nextToken());
						autorAux.setSegundoApellido(tk.nextToken());
					} else if (tk.countTokens() == 4) {
						autorAux.setNombre(tk.nextToken() + " " + tk.nextToken());
						autorAux.setPrimerApellido(tk.nextToken());
						autorAux.setSegundoApellido(tk.nextToken());
					}
					servicio_autor.crear(autorAux);
					produccionArticuloAux.setAutor(autorAux);
					produccionArticuloAux.setOrden(orden);
					produccionArticuloAux.setArticulo(articulo);
					// servicio_orden.crear(orden);
					// ya mandamos a crear la producción
					servicio_produccion_academica_articulo.crear(produccionArticuloAux);
				}
				if (palabras.get(i).equals("|.")) {
					posicionAutor = 0;
					break;

				}
			}
		}

	}

	public void crearLibro(int inicioLibro) {
		String titulo = null;
		int inicioTitulo = 0;
		int finalTitulo = 0;
		String ISBN = null;
		String doi = null;
		SimpleDateFormat formato = new SimpleDateFormat("yyyy/dd/MM");
		Date fechaPublicacion = null;
		int volumen = 0;
		int tomo = 0;
		int numPaginas = 0;
		String editorial = null;
		int numEdicion = 0;
		int añoEdicion = 0;
		String tituloTraducido = null;
		int inicioTituloTrad = 0;
		int finalTituloTrad = 0;
		String idiomaTrad = null;
		int inicioPais = 0;
		int finalPais = 0;
		String pais = null;
		String idioma = null;

		int contadorAutores = 0;
		for (int i = inicioLibro; i < palabras.size(); i++) {
			if (palabras.get(i).equals("TITULO:")) {
				inicioTitulo = i + 1;
			}
			if (palabras.get(i).equals("ISBN:")) {
				finalTitulo = i - 1;
				ISBN = palabras.get(i + 1);
			}
			if (palabras.get(i).equals("DOI:")) {
				doi = palabras.get(i + 1);
			}
			if (palabras.get(i).equals("FECHA_DE_PUBLICACION:")) {
				try {
					fechaPublicacion = formato.parse(palabras.get(i + 1));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (palabras.get(i).equals("VOLUMEN:")) {
				volumen = Integer.parseInt(palabras.get(i + 1));
			}
			if (palabras.get(i).equals("TOMO:")) {
				tomo = Integer.parseInt(palabras.get(i + 1));
			}
			if (palabras.get(i).equals("NUMERO_DE_PAGINAS:")) {
				editorial = palabras.get(i + 1);
			}
			if (palabras.get(i).equals("NUMERO_DE_EDICION:")) {
				numEdicion = Integer.parseInt(palabras.get(i + 1));
			}
			if (palabras.get(i).equals("AÑO_DE_EDICION:")) {
				añoEdicion = Integer.parseInt(palabras.get(i + 1));
			}
			if (palabras.get(i).equals("TITULO_TRADUCIDO:")) {
				inicioTituloTrad = i + 1;
			}
			if (palabras.get(i).equals("IDIOMA_TRADUCIDO:")) {
				finalTituloTrad = i - 1;
				idiomaTrad = palabras.get(i + 1);
			}
			if (palabras.get(i).equals("PAIS:")) {
				inicioPais = i + 1;
			}
			if (palabras.get(i).equals("IDIOMA:")) {
				finalPais = i - 1;
				idioma = palabras.get(i + 1);
			}
			if (palabras.get(i).equals("AUTORES:")) {
				posicionAutor = i;
				break;
			}

		}

		StringBuilder builderTitulo = new StringBuilder();
		StringBuilder builderTituloTrad = new StringBuilder();
		StringBuilder builderPais = new StringBuilder();
		for (int i = inicioTitulo; i <= finalTitulo; i++) {
			builderTitulo.append(palabras.get(i) + " ");
		}
		for (int i = inicioTituloTrad; i <= finalTituloTrad; i++) {
			builderTituloTrad.append(palabras.get(i) + " ");
		}
		for (int i = inicioPais; i <= finalPais; i++) {
			builderPais.append(palabras.get(i) + " ");
		}
		titulo = builderTitulo.toString();
		tituloTraducido = builderTituloTrad.toString();
		pais = builderPais.toString();
		ELibro libro = new ELibro();
		libro.setIsbn(ISBN);
		libro.setTitulo(titulo);
		libro.setIdioma(idioma);
		libro.setPais(pais);
		libro.setFecha_publicacion(fechaPublicacion);
		libro.setVolumen(volumen);
		libro.setTomo(tomo);
		libro.setDoi(doi);
		libro.setNumero_paginas(numPaginas);
		libro.setEditorial(editorial);
		libro.setNumero_edicion(numEdicion);
		libro.setAño_edicion(añoEdicion);
		libro.setTitulo_traducido(tituloTraducido);
		libro.setIdioma_traducido(idiomaTrad);

		if (servicio_libro.crear(libro) == true) {
			for (int i = posicionAutor; i < palabras.size(); i++) {
				if (palabras.get(i).equals("AUTOR:")) {
					EProduccionAcademicaLibro produccionAcademicaLibro = new EProduccionAcademicaLibro();
					EAutor autorAux = new EAutor();
					EOrden orden = new EOrden();
					contadorAutores++;
					orden.setId(contadorAutores);

					// limpiamos el nombre de los guiones bajos
					String cadena = palabras.get(i + 1);
					cadena = cadena.replace("_", " ");
					StringTokenizer tk = new StringTokenizer(cadena);
					
					if (tk.countTokens() == 3) {
						autorAux.setNombre(tk.nextToken());
						autorAux.setPrimerApellido(tk.nextToken());
						autorAux.setSegundoApellido(tk.nextToken());
					} else if (tk.countTokens() == 4) {
						autorAux.setNombre(tk.nextToken() + " " + tk.nextToken());
						autorAux.setPrimerApellido(tk.nextToken());
						autorAux.setSegundoApellido(tk.nextToken());
					}
					
					servicio_autor.crear(autorAux);
					produccionAcademicaLibro.setAutor(autorAux);
					produccionAcademicaLibro.setLibro(libro);
					produccionAcademicaLibro.setOrden(orden);

					// ya mandamos a crear la producción
					servicio_produccion_academica_libro.crear(produccionAcademicaLibro);
				}
				if (palabras.get(i).equals("|.")) {
					posicionAutor = 0;
					break;

				}
			}
		}
	}

	public void crearReporte(int inicioReporte) {
		int inicioTitulo = 0;
		int finalTitulo = 0;
		String titulo = null;
		int inicioInstitucion = 0;
		int finalInstitucion = 0;
		String institucionAux = null;
		boolean publicaPriv = false;
		String tipoInstitucion = null;
		String origenReporteAux = null;
		SimpleDateFormat formato = new SimpleDateFormat("yyyy/dd/MM");
		Date fechaEntrega = null;
		Date fechaPublicaicon = null;
		int num_paginas = 0;
		int inicioDescripcion = 0;
		int finalDescripcion = 0;
		String descripcion = null;
		int inicioObjetivos = 0;
		int finalObjetivos = 0;
		String objetivosReporte = null;

		int contadorEditores = 0;

		for (int i = inicioReporte; i < palabras.size(); i++) {
			if (palabras.get(i).equals("TITULO:")) {
				inicioTitulo = i + 1;
			}
			if (palabras.get(i).equals("INSTITUCION:")) {
				finalTitulo = i - 1;
				inicioInstitucion = i + 1;
			}
			if (palabras.get(i).equals("PUBLICA_O_PRIVADA:")) {
				finalInstitucion = i - 1;
				if (palabras.get(i + 1).equals("Pública")) {
					publicaPriv = true;
				}
			}
			if (palabras.get(i).equals("TIPO_INSTITUCION:")) {
				tipoInstitucion = palabras.get(i + 1);
			}
			if (palabras.get(i).equals("ORIGEN_DEL_REPORTE:")) {
				origenReporteAux = palabras.get(i + 1);
			}
			if (palabras.get(i).equals("FECHA_DE_ENTREGA:")) {
				try {
					fechaEntrega = formato.parse(palabras.get(i + 1));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (palabras.get(i).equals("FECHA_DE_PUBLICACION:")) {
				try {
					fechaPublicaicon = formato.parse(palabras.get(i + 1));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (palabras.get(i).equals("NUMERO_DE_PAGINAS:")) {
				num_paginas = Integer.parseInt(palabras.get(i + 1));
			}
			if (palabras.get(i).equals("DESCRIPCION:")) {
				inicioDescripcion = i + 1;
			}
			if (palabras.get(i).equals("OBJETIVOS_DEL_REPORTE:")) {
				finalDescripcion = i - 1;
				inicioObjetivos = i + 1;

			}
			if (palabras.get(i).equals("EDITORES:")) {
				finalObjetivos = i - 1;
				posicionEditor = i;
				break;
			}
		}
		StringBuilder builderTitulo = new StringBuilder();
		StringBuilder builderInstitucion = new StringBuilder();
		StringBuilder builderDescripcion = new StringBuilder();
		StringBuilder builderObjetivos = new StringBuilder();
		for (int i = inicioTitulo; i <= finalTitulo; i++) {
			builderTitulo.append(palabras.get(i) + " ");
		}
		for (int i = inicioInstitucion; i <= finalInstitucion; i++) {
			builderInstitucion.append(palabras.get(i) + " ");
		}
		for (int i = inicioDescripcion; i <= finalDescripcion; i++) {
			builderDescripcion.append(palabras.get(i) + " ");
		}
		for (int i = inicioObjetivos; i <= finalObjetivos; i++) {
			builderObjetivos.append(palabras.get(i) + " ");
		}
		titulo = builderTitulo.toString();
		institucionAux = builderInstitucion.toString();
		descripcion = builderDescripcion.toString();
		objetivosReporte = builderObjetivos.toString();

		EReporte reporte = new EReporte();
		EInstitucion institucion = new EInstitucion();
		EOrigenReporte origenReporte = new EOrigenReporte();

		reporte.setTitulo(titulo);
		institucion.setNombre(institucionAux);
		institucion.setPublica_privada(publicaPriv);
		institucion.setTipo_institucion(tipoInstitucion);
		origenReporte.setOrigen(origenReporteAux);
		reporte.setFecha_entrega(fechaEntrega);
		reporte.setFecha_publicacion(fechaPublicaicon);
		reporte.setNumero_paginas(num_paginas);
		reporte.setDescripcion(descripcion);
		reporte.setObjetivos(objetivosReporte);

		servicio_institucion.crear(institucion);
		servicio_origen_reporte.crear(origenReporte);
		if (servicio_reporte.crear(reporte) == true) {
			for (int i = posicionEditor; i < palabras.size(); i++) {
				if (palabras.get(i).equals("EDITOR:")) {
					EProduccionAcademicaReporte produccionAcademicaReporte = new EProduccionAcademicaReporte();
					EEditor editor = new EEditor();
					EOrden orden = new EOrden();
					contadorEditores++;
					orden.setId(contadorEditores);

					// limpiamos el nombre de los guiones bajos
					String cadena = palabras.get(i + 1);
					cadena = cadena.replace("_", " ");
					StringTokenizer tk = new StringTokenizer(cadena);
					if (tk.countTokens() == 3) {
						editor.setNombre(tk.nextToken());
						editor.setPrimerApellido(tk.nextToken());
						editor.setSegundoApellido(tk.nextToken());
					} else if (tk.countTokens() == 4) {
						editor.setNombre(tk.nextToken() + " " + tk.nextToken());
						editor.setPrimerApellido(tk.nextToken());
						editor.setSegundoApellido(tk.nextToken());
					}
					servicio_editor.crear(editor);
					produccionAcademicaReporte.setEditor(editor);
					produccionAcademicaReporte.setOrden(orden);
					produccionAcademicaReporte.setReporte(reporte);

					// ya mandamos a crear la producción
					servicio_produccion_academica_reporte.crear(produccionAcademicaReporte);
				}
				if (palabras.get(i).equals("|.")) {
					posicionEditor = 0;
					break;

				}
			}
		}

	}

	public void crearInnovacion(int inicioInnovacion) {
		int inicioNombre = 0;
		int finalNombre = 0;
		String nombre = null;
		SimpleDateFormat formato = new SimpleDateFormat("yyyy/dd/MM");
		Date fechaFinalizacion = null;
		int inicioDescripcion = 0;
		int finalDescripcion = 0;
		String descripcion = null;
		int contadorAutores = 0;
		for (int i = inicioInnovacion; i < palabras.size(); i++) {
			if (palabras.get(i).equals("NOMBRE:")) {
				inicioNombre = i + 1;
			}
			if (palabras.get(i).equals("FECHA_DE_FINALIZACION:")) {
				finalNombre = i - 1;
				try {
					fechaFinalizacion = formato.parse(palabras.get(i + 1));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (palabras.get(i).equals("DESCRIPCION:")) {
				inicioDescripcion = i + 1;
			}
			if (palabras.get(i).equals("AUTORES:")) {
				finalDescripcion = i - 1;
				posicionAutor = i;
				break;
			}
		}
		StringBuilder builderNombre = new StringBuilder();
		StringBuilder builderDescripcion = new StringBuilder();
		for (int i = inicioNombre; i <= finalNombre; i++) {
			builderNombre.append(palabras.get(i) + " ");
		}
		for (int i = inicioDescripcion; i <= finalDescripcion; i++) {
			builderDescripcion.append(palabras.get(i) + " ");
		}
		nombre = builderNombre.toString();
		descripcion = builderDescripcion.toString();

		EInnovacion innovacion = new EInnovacion();
		innovacion.setNombre(nombre);
		innovacion.setFecha_fin(fechaFinalizacion);
		innovacion.setDescripcion(descripcion);

		if (servicio_innovacion.crear(innovacion) == true) {
			for (int i = posicionAutor; i < palabras.size(); i++) {
				if (palabras.get(i).equals("AUTOR:")) {
					EProduccionAcademicaInnovacion produccionAcademicaInnovacion = new EProduccionAcademicaInnovacion();
					EAutor autorAux = new EAutor();
					EOrden orden = new EOrden();
					contadorAutores++;
					orden.setId(contadorAutores);

					// limpiamos el nombre de los guiones bajos
					String cadena = palabras.get(i + 1);
					cadena = cadena.replace("_", " ");
					StringTokenizer tk = new StringTokenizer(cadena);
					if (tk.countTokens() == 3) {
						autorAux.setNombre(tk.nextToken());
						autorAux.setPrimerApellido(tk.nextToken());
						autorAux.setSegundoApellido(tk.nextToken());
					} else if (tk.countTokens() == 4) {
						autorAux.setNombre(tk.nextToken() + " " + tk.nextToken());
						autorAux.setPrimerApellido(tk.nextToken());
						autorAux.setSegundoApellido(tk.nextToken());
					}
					servicio_autor.crear(autorAux);
					produccionAcademicaInnovacion.setAutor(autorAux);
					produccionAcademicaInnovacion.setInnovacion(innovacion);
					produccionAcademicaInnovacion.setOrden(orden);

					// ya mandamos a crear la producción
					servicio_produccion_academica_innovacion.crear(produccionAcademicaInnovacion);
				}
				if (palabras.get(i).equals("|.")) {
					posicionAutor = 0;
					break;

				}
			}
		}

	}

	public void crearDesarrollo(int inicioDesarrollo) {
		int inicioNombre = 0;
		int finalNombre = 0;
		String nombre = null;
		int inicioRolParticipacion = 0;
		int finalRolParticipacion = 0;
		String rolParticipacionAux = null;
		int inicioTipoDesarrollo = 0;
		int finalTipoDesarrollo = 0;
		String tipoDesarrolloAux = null;
		String documentoRespaldo = null;
		int inicioObjetivos = 0;
		int finalObjetivos = 0;
		String objetivos = null;
		int inicioResumen = 0;
		int finalResumen = 0;
		String resumen = null;
		int contadorAutores = 0;

		for (int i = inicioDesarrollo; i < palabras.size(); i++) {
			if (palabras.get(i).equals("NOMBRE:")) {
				inicioNombre = i + 1;
			}
			if (palabras.get(i).equals("ROL_DE_PARTICIPACION:")) {
				finalNombre = i - 1;
				inicioRolParticipacion = i + 1;
			}
			if (palabras.get(i).equals("TIPO_DE_DESARROLLO:")) {
				finalRolParticipacion = i - 1;
				inicioTipoDesarrollo = i + 1;
			}
			if (palabras.get(i).equals("DOCUMENTO_DE_RESPALDO:")) {
				finalTipoDesarrollo = i - 1;
				documentoRespaldo = palabras.get(i + 1);
			}
			if (palabras.get(i).equals("OBJETIVOS:")) {
				inicioObjetivos = i + 1;
			}
			if (palabras.get(i).equals("RESUMEN:")) {
				finalObjetivos = i - 1;
				inicioResumen = i + 1;
			}
			if (palabras.get(i).equals("AUTORES:")) {
				finalResumen = i - 1;
				posicionAutor = i;
				break;
			}
		}

		StringBuilder builderNombre = new StringBuilder();
		StringBuilder builderRolParticipacion = new StringBuilder();
		StringBuilder builderTipoDesarrollo = new StringBuilder();
		StringBuilder builderObjetivos = new StringBuilder();
		StringBuilder builderResumen = new StringBuilder();
		for (int i = inicioNombre; i <= finalNombre; i++) {
			builderNombre.append(palabras.get(i) + " ");
		}
		for (int i = inicioRolParticipacion; i <= finalRolParticipacion; i++) {
			builderRolParticipacion.append(palabras.get(i) + " ");
		}
		for (int i = inicioTipoDesarrollo; i <= finalTipoDesarrollo; i++) {
			builderTipoDesarrollo.append(palabras.get(i) + " ");
		}
		for (int i = inicioObjetivos; i <= finalObjetivos; i++) {
			builderObjetivos.append(palabras.get(i) + " ");
		}
		for (int i = inicioResumen; i <= finalResumen; i++) {
			builderResumen.append(palabras.get(i) + " ");
		}
		nombre = builderNombre.toString();
		rolParticipacionAux = builderRolParticipacion.toString();
		tipoDesarrolloAux = builderTipoDesarrollo.toString();
		objetivos = builderObjetivos.toString();
		resumen = builderResumen.toString();

		EDesarrollo desarrollo = new EDesarrollo();
		ERolParticipacion rolParticipacion = new ERolParticipacion();
		ETipoDesarrollo tipoDesarrollo = new ETipoDesarrollo();
		EDocumentoRespaldo documentoRespaldo2 = new EDocumentoRespaldo();

		desarrollo.setNombre(nombre);
		rolParticipacion.setRol(rolParticipacionAux);
		desarrollo.setRolParticipacion(rolParticipacion);
		tipoDesarrollo.setTipo(tipoDesarrolloAux);
		desarrollo.setTipoDesarrollo(tipoDesarrollo);
		documentoRespaldo2.setDocumento(documentoRespaldo);
		desarrollo.setDocumentoRespaldo(documentoRespaldo2);
		desarrollo.setObjetivos(objetivos);
		desarrollo.setResumen(resumen);

		servicio_rol_participacion.crear(rolParticipacion);
		servicio_tipo_desarrollo.crear(tipoDesarrollo);
		servicio_documento_respaldo.crear(documentoRespaldo2);
		if (servicio_desarrollo.crear(desarrollo) == true) {
			for (int i = posicionAutor; i < palabras.size(); i++) {
				if (palabras.get(i).equals("AUTOR:")) {
					EProduccionAcademicaDesarrollo produccionAcademicaDesarrollo = new EProduccionAcademicaDesarrollo();
					EAutor autorAux = new EAutor();
					EOrden orden = new EOrden();
					contadorAutores++;
					orden.setId(contadorAutores);

					// limpiamos el nombre de los guiones bajos
					String cadena = palabras.get(i + 1);
					cadena = cadena.replace("_", " ");
					StringTokenizer tk = new StringTokenizer(cadena);
					if (tk.countTokens() == 3) {
						autorAux.setNombre(tk.nextToken());
						autorAux.setPrimerApellido(tk.nextToken());
						autorAux.setSegundoApellido(tk.nextToken());
					} else if (tk.countTokens() == 4) {
						autorAux.setNombre(tk.nextToken() + " " + tk.nextToken());
						autorAux.setPrimerApellido(tk.nextToken());
						autorAux.setSegundoApellido(tk.nextToken());
					}
					servicio_autor.crear(autorAux);
					produccionAcademicaDesarrollo.setAutor(autorAux);
					produccionAcademicaDesarrollo.setDesarrollo(desarrollo);
					produccionAcademicaDesarrollo.setOrden(orden);

					// ya mandamos a crear la producción
					servicio_produccion_academica_desarrollo.crear(produccionAcademicaDesarrollo);
				}
				if (palabras.get(i).equals("|.")) {
					posicionAutor = 0;
					break;

				}
			}
		}

	}

	public void crearMemoria(int inicioMemoria) {
		int inicioTitulo = 0;
		int finalTitulo = 0;
		String titulo = null;
		String nombre = null;
		String nombre2 = null;
		String apellidoP = null;
		String apellidoM = null;
		boolean dosNombres = false;
		int inicioPublicacion = 0;
		int finalPublicaicon = 0;
		String publicacion = null;
		int paginaInicial = 0;
		int paginaFinal = 0;
		int añoPublicacion = 0;
		int inicioPais = 0;
		int finalPais = 0;
		String pais = null;
		int contadorEditores = 0;

		for (int i = inicioMemoria; i < palabras.size(); i++) {
			if (palabras.get(i).equals("TITULO:")) {
				inicioTitulo = i + 1;
			}
			if (palabras.get(i).equals("NOMBRE:")) {
				finalTitulo = i - 1;
				if (palabras.get(i + 4).equals("TITULO_DE_LA_PUBLICACION:")) {
					nombre = palabras.get(i + 1);
					apellidoP = palabras.get(i + 2);
					apellidoM = palabras.get(i + 3);
				}
				if (palabras.get(i + 5).equals("TITULO_DE_LA_PUBLICACION:")) {
					nombre = palabras.get(i + 1);
					nombre2 = palabras.get(i + 2);
					nombre = nombre + " " + nombre2;
					apellidoP = palabras.get(i + 3);
					apellidoM = palabras.get(i + 4);
					dosNombres = true;
				}
			}
			if (palabras.get(i).equals("TITULO_DE_LA_PUBLICACION:")) {
				inicioPublicacion = i + 1;
			}
			if (palabras.get(i).equals("PAGINA_INICIAL:")) {
				finalPublicaicon = i - 1;
				paginaInicial = Integer.parseInt(palabras.get(i + 1));
			}
			if (palabras.get(i).equals("PAGINA_FINAL:")) {
				paginaFinal = Integer.parseInt(palabras.get(i + 1));
			}
			if (palabras.get(i).equals("AÑO_DE_PUBLICACION:")) {
				añoPublicacion = Integer.parseInt(palabras.get(i + 1));
			}
			if (palabras.get(i).equals("PAIS:")) {
				inicioPais = i + 1;
			}
			if (palabras.get(i).equals("EDITORES:")) {
				finalPais = i - 1;
				posicionEditor = i;
				break;
			}
		}

		StringBuilder builderTitulo = new StringBuilder();
		StringBuilder builderpublicacion = new StringBuilder();
		StringBuilder builderPais = new StringBuilder();
		for (int i = inicioTitulo; i <= finalTitulo; i++) {
			builderTitulo.append(palabras.get(i) + " ");
		}
		for (int i = inicioPublicacion; i <= finalPublicaicon; i++) {
			builderpublicacion.append(palabras.get(i) + " ");
		}
		for (int i = inicioPais; i <= finalPais; i++) {
			builderPais.append(palabras.get(i) + " ");
		}
		titulo = builderTitulo.toString();
		publicacion = builderpublicacion.toString();
		pais = builderPais.toString();

		EMemoria memoria = new EMemoria();
		EAutor autor = new EAutor();
		autor.setNombre(nombre);
		autor.setPrimerApellido(apellidoP);
		autor.setSegundoApellido(apellidoM);
		servicio_autor.crear(autor);

		memoria.setTitulo(titulo);
		memoria.setNombre(nombre);
		memoria.setPrimer_apellido(apellidoP);
		memoria.setSegundo_apellido(apellidoM);
		memoria.setTitulo_publicacion(publicacion);
		memoria.setPagina_inicio(paginaInicial);
		memoria.setPagina_fin(paginaFinal);
		memoria.setAño_publicacion(añoPublicacion);
		memoria.setPais(pais);

		if (servicio_memoria.crear(memoria) == true) {
			for (int i = posicionEditor; i < palabras.size(); i++) {
				if (palabras.get(i).equals("EDITOR:")) {
					EProduccionAcademicaMemoria produccionAcademicaMemoria = new EProduccionAcademicaMemoria();
					EEditor editor = new EEditor();
					EOrden orden = new EOrden();
					contadorEditores++;
					orden.setId(contadorEditores);

					// limpiamos el nombre de los guiones bajos
					String cadena = palabras.get(i + 1);
					cadena = cadena.replace("_", " ");
					StringTokenizer tk = new StringTokenizer(cadena);
					if (tk.countTokens() == 3) {
						editor.setNombre(tk.nextToken());
						editor.setPrimerApellido(tk.nextToken());
						editor.setSegundoApellido(tk.nextToken());
					} else if (tk.countTokens() == 4) {
						editor.setNombre(tk.nextToken() + " " + tk.nextToken());
						editor.setPrimerApellido(tk.nextToken());
						editor.setSegundoApellido(tk.nextToken());
					}
					servicio_editor.crear(editor);
					produccionAcademicaMemoria.setAutor(autor);
					produccionAcademicaMemoria.setEditor(editor);
					produccionAcademicaMemoria.setMemoria(memoria);
					produccionAcademicaMemoria.setOrden(orden);

					// ya mandamos a crear la producción
					servicio_produccion_academica_memoria.crear(produccionAcademicaMemoria);
				}
				if (palabras.get(i).equals("|.")) {
					posicionEditor = 0;
					break;

				}
			}
		}

	}

	public void crearDocumentoReseña(int inicioDocumento, boolean documentoReseña) {
		int inicioTitulo = 0;
		int finalTitulo = 0;
		String titulo = null;
		String nombre = null;
		String nombre2 = null;
		String apellidoP = null;
		String apellidoM = null;
		boolean dosNombres = false;
		int paginaInicial = 0;
		int paginaFinal = 0;
		int contadorEditores = 0;

		for (int i = inicioDocumento; i < palabras.size(); i++) {
			if (palabras.get(i).equals("TITULO:")) {
				inicioTitulo = i + 1;
			}
			if (palabras.get(i).equals("NOMBRE:")) {
				finalTitulo = i - 1;
				if (palabras.get(i + 4).equals("PAGINA_INICIAL:")) {
					nombre = palabras.get(i + 1);
					apellidoP = palabras.get(i + 2);
					apellidoM = palabras.get(i + 3);
				}
				if (palabras.get(i + 5).equals("PAGINA_INICIAL:")) {
					nombre = palabras.get(i + 1);
					nombre2 = palabras.get(i + 2);
					nombre = nombre + " " + nombre2;
					apellidoP = palabras.get(i + 3);
					apellidoM = palabras.get(i + 4);
					dosNombres = true;
				}
			}
			if (palabras.get(i).equals("PAGINA_INICIAL:")) {
				paginaInicial = Integer.parseInt(palabras.get(i + 1));
			}
			if (palabras.get(i).equals("PAGINA_FINAL:")) {
				paginaFinal = Integer.parseInt(palabras.get(i + 1));

			}
			if (palabras.get(i).equals("EDITORES:")) {
				posicionEditor = i;
				break;
			}

		}

		StringBuilder builderTitulo = new StringBuilder();
		for (int i = inicioTitulo; i <= finalTitulo; i++) {
			builderTitulo.append(palabras.get(i) + " ");
		}
		titulo = builderTitulo.toString();

		EDocumentos_Reseñas documentos_Reseñas = new EDocumentos_Reseñas();
		documentos_Reseñas.setTitulo(titulo);
		documentos_Reseñas.setDocumento_reseña(documentoReseña);
		documentos_Reseñas.setNombre(nombre);
		documentos_Reseñas.setPrimer_apellido(apellidoP);
		documentos_Reseñas.setSegundo_apellido(apellidoM);
		documentos_Reseñas.setPagina_inicio(paginaInicial);
		documentos_Reseñas.setPagina_fin(paginaFinal);

		if (servicio_documento_reseña.crear(documentos_Reseñas) == true) {
			for (int i = posicionEditor; i < palabras.size(); i++) {
				if (palabras.get(i).equals("EDITOR:")) {
					EProduccionAcademicaDocumentosReseña produccionAcademicaDocumentosReseña = new EProduccionAcademicaDocumentosReseña();
					EEditor editor = new EEditor();
					EOrden orden = new EOrden();
					contadorEditores++;
					orden.setId(contadorEditores);

					// limpiamos el nombre de los guiones bajos
					String cadena = palabras.get(i + 1);
					cadena = cadena.replace("_", " ");
					StringTokenizer tk = new StringTokenizer(cadena);
					if (tk.countTokens() == 3) {
						editor.setNombre(tk.nextToken());
						editor.setPrimerApellido(tk.nextToken());
						editor.setSegundoApellido(tk.nextToken());
					} else if (tk.countTokens() == 4) {
						editor.setNombre(tk.nextToken() + " " + tk.nextToken());
						editor.setPrimerApellido(tk.nextToken());
						editor.setSegundoApellido(tk.nextToken());
					}
					servicio_editor.crear(editor);
					produccionAcademicaDocumentosReseña.setDocumento_reseña(documentos_Reseñas);
					produccionAcademicaDocumentosReseña.setEditor(editor);
					produccionAcademicaDocumentosReseña.setOrden(orden);

					// ya mandamos a crear la producción
					servicio_produccion_academica_documento_reseña.crear(produccionAcademicaDocumentosReseña);
				}
				if (palabras.get(i).equals("|.")) {
					posicionEditor = 0;
					break;

				}
			}
		}

	}

	public void crearConferenciaPresentacion(int inicioConferenciaPresentacion, boolean conferenciaPresentacion,
			EAutor autor) {
		int inicioTitulo = 0;
		int finalTitulo = 0;
		String titulo = null;
		int inicioEvento = 0;
		int finalEvento = 0;
		String evento = null;
		SimpleDateFormat formato = new SimpleDateFormat("yyyy/dd/MM");
		Date fechaPresentacion = null;
		int inicioCiudad = 0;
		int finalCiudad = 0;
		String ciudad = null;
		int inicioPais = 0;
		int finalPais = 0;
		String pais = null;

		for (int i = inicioConferenciaPresentacion; i < palabras.size(); i++) {
			if (palabras.get(i).equals("TITULO:")) {
				inicioTitulo = i + 1;
			}
			if (palabras.get(i).equals("EVENTO:")) {
				finalTitulo = i - 1;
				inicioEvento = i + 1;
			}
			if (palabras.get(i).equals("FECHA_DE_PRESENTACION:")) {
				finalEvento = i - 1;
				try {
					fechaPresentacion = formato.parse(palabras.get(i + 1));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (palabras.get(i).equals("CIUDAD:")) {
				inicioCiudad = i + 1;
			}
			if (palabras.get(i).equals("PAIS:")) {
				finalCiudad = i - 1;
				inicioPais = i + 1;
			}
			if (palabras.get(i).equals("|.")) {
				finalPais = i - 1;
				break;
			}
		}
		EConferenciaPresentacion conferencia_presentacion = new EConferenciaPresentacion();
		conferencia_presentacion.setTitulo(titulo);
		conferencia_presentacion.setConferencia_presentacion(conferenciaPresentacion);
		conferencia_presentacion.setEvento(evento);
		conferencia_presentacion.setFecha_presentacion(fechaPresentacion);
		conferencia_presentacion.setCiudad(ciudad);
		conferencia_presentacion.setPais(pais);

		servicio_autor.crear(autor);
		servicio_conferencia_presentacion.crear(conferencia_presentacion);
		EProduccionAcademicaConferenciaPresentacion produccionAcademicaConferenciaPresentacion = new EProduccionAcademicaConferenciaPresentacion();
		produccionAcademicaConferenciaPresentacion.setAutor(autor);
		produccionAcademicaConferenciaPresentacion.setConferenciaPresentacion(conferencia_presentacion);

		servicio_produccion_academica_conferencia_presentacion.crear(produccionAcademicaConferenciaPresentacion);

	}
}
