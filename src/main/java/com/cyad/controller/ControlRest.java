package com.cyad.controller;

import java.io.File;
import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cyad.aspirantes.entity.EAdeudoAspirante;
import com.cyad.aspirantes.entity.EAspirante;
import com.cyad.aspirantes.entity.EEstadoAspirante;
import com.cyad.aspirantes.model.MAdeudoAspirante;
import com.cyad.aspirantes.model.MAspirante;
import com.cyad.aspirantes.model.MEstadoAspirante;
import com.cyad.aspirantes.service.AdeudoAspiranteService;
import com.cyad.aspirantes.service.AspiranteService;
import com.cyad.aspirantes.service.EstadoAspiranteService;
import com.cyad.datamart.service.AlumnoServiceDatamart;
import com.cyad.posgrado.entity.EAdeudo;
import com.cyad.posgrado.entity.EAlumno;
import com.cyad.posgrado.entity.EAlumnoBeca;
import com.cyad.posgrado.entity.EAlumno_Identificador_puente;
import com.cyad.posgrado.entity.EAreaConcentracion;
import com.cyad.posgrado.entity.EAreaInvestigacion;
import com.cyad.posgrado.entity.EBecas;
import com.cyad.posgrado.entity.ECorreo;
import com.cyad.posgrado.entity.EDatosAcademicos;
import com.cyad.posgrado.entity.EDatosIngreso;
import com.cyad.posgrado.entity.EDedicacion;
import com.cyad.posgrado.entity.EDepartamento;
import com.cyad.posgrado.entity.EDireccion;
import com.cyad.posgrado.entity.EDivision;
import com.cyad.posgrado.entity.EEstadoAcademico;
import com.cyad.posgrado.entity.EGrupoProtocolo;
import com.cyad.posgrado.entity.EIdentificadores_Investigacion;
import com.cyad.posgrado.entity.EInstitucion;
import com.cyad.posgrado.entity.ENivel;
import com.cyad.posgrado.entity.EParticipante;
import com.cyad.posgrado.entity.EPlan;
import com.cyad.posgrado.entity.EProfesor;
import com.cyad.posgrado.entity.EProfesor_Identificador_puente;
import com.cyad.posgrado.entity.EProyecto;
import com.cyad.posgrado.entity.ERol;
import com.cyad.posgrado.entity.ETelefono;
import com.cyad.posgrado.entity.ETipoParticipante;
import com.cyad.posgrado.entity.ETipoProyecto;
import com.cyad.posgrado.entity.ETrimestre;
import com.cyad.posgrado.model.MAdeudo;
import com.cyad.posgrado.model.MAlumno;
import com.cyad.posgrado.model.MAlumnoBeca;
import com.cyad.posgrado.model.MAlumno_Identificador_puente;
import com.cyad.posgrado.model.MAreaConcentracion;
import com.cyad.posgrado.model.MAreaInvestigacion;
import com.cyad.posgrado.model.MBecas;
import com.cyad.posgrado.model.MCorreo;
import com.cyad.posgrado.model.MDatosAcademicos;
import com.cyad.posgrado.model.MDatosIngreso;
import com.cyad.posgrado.model.MDedicacion;
import com.cyad.posgrado.model.MDepartamento;
import com.cyad.posgrado.model.MDireccion;
import com.cyad.posgrado.model.MDivision;
import com.cyad.posgrado.model.MEstadoAcademico;
import com.cyad.posgrado.model.MGrupoProtocolo;
import com.cyad.posgrado.model.MIdentificadores_Investigacion;
import com.cyad.posgrado.model.MInstitucion;
import com.cyad.posgrado.model.MNivel;
import com.cyad.posgrado.model.MParticipante;
import com.cyad.posgrado.model.MPlan;
import com.cyad.posgrado.model.MProfesor;
import com.cyad.posgrado.model.MProfesor_Identificador_puente;
import com.cyad.posgrado.model.MProyecto;
import com.cyad.posgrado.model.MRol;
import com.cyad.posgrado.model.MTelefono;
import com.cyad.posgrado.model.MTipoParticipante;
import com.cyad.posgrado.model.MTipoProyecto;
import com.cyad.posgrado.model.MTrimestre;
import com.cyad.posgrado.service.AdeudoService;
import com.cyad.posgrado.service.AlumnoBecaService;
import com.cyad.posgrado.service.AlumnoIdentificadorService;
import com.cyad.posgrado.service.AlumnoService;
import com.cyad.posgrado.service.AreaConcentracionService;
import com.cyad.posgrado.service.AreaInvestigacionService;
import com.cyad.posgrado.service.BecasService;
import com.cyad.posgrado.service.CorreoService;
import com.cyad.posgrado.service.DatosAcademicosService;
import com.cyad.posgrado.service.DatosIngresoService;
import com.cyad.posgrado.service.DedicacionService;
import com.cyad.posgrado.service.DepartamentoService;
import com.cyad.posgrado.service.DireccionService;
import com.cyad.posgrado.service.DivisionService;
import com.cyad.posgrado.service.EstadoAcademicoService;
import com.cyad.posgrado.service.GrupoProtocoloService;
import com.cyad.posgrado.service.Identificadores_InvestigacionService;
import com.cyad.posgrado.service.InstitucionService;
import com.cyad.posgrado.service.NivelService;
import com.cyad.posgrado.service.ParticipanteService;
import com.cyad.posgrado.service.PlanService;
import com.cyad.posgrado.service.ProfesorIdentificadorService;
import com.cyad.posgrado.service.ProfesorService;
import com.cyad.posgrado.service.ProyectoService;
import com.cyad.posgrado.service.RolService;
import com.cyad.posgrado.service.TelefonoService;
import com.cyad.posgrado.service.TipoParticipanteService;
import com.cyad.posgrado.service.TipoProyectoService;
import com.cyad.posgrado.service.TrimestreService;
import com.cyad.producciones.entity.EArticulo;
import com.cyad.producciones.entity.EArticuloPalabrasPuente;
import com.cyad.producciones.entity.EAutor;
import com.cyad.producciones.entity.EConferenciaPresentacion;
import com.cyad.producciones.entity.EDesarrollo;
import com.cyad.producciones.entity.EDocumentoReseñaPalabrasPuente;
import com.cyad.producciones.entity.EDocumentoRespaldo;
import com.cyad.producciones.entity.EDocumentos_Reseñas;
import com.cyad.producciones.entity.EEditor;
import com.cyad.producciones.entity.EInnovacion;
import com.cyad.producciones.entity.ELibro;
import com.cyad.producciones.entity.ELibroPalabrasPuente;
import com.cyad.producciones.entity.EMemoria;
import com.cyad.producciones.entity.EMemoriaPalabrasPuente;
import com.cyad.producciones.entity.EOrden;
import com.cyad.producciones.entity.EOrigenReporte;
import com.cyad.producciones.entity.EPalabrasClave;
import com.cyad.producciones.entity.EProduccionAcademicaArticulo;
import com.cyad.producciones.entity.EProduccionAcademicaConferenciaPresentacion;
import com.cyad.producciones.entity.EProduccionAcademicaDesarrollo;
import com.cyad.producciones.entity.EProduccionAcademicaDocumentosReseña;
import com.cyad.producciones.entity.EProduccionAcademicaInnovacion;
import com.cyad.producciones.entity.EProduccionAcademicaLibro;
import com.cyad.producciones.entity.EProduccionAcademicaMemoria;
import com.cyad.producciones.entity.EProduccionAcademicaReporte;
import com.cyad.producciones.entity.EReporte;
import com.cyad.producciones.entity.EReportePalabrasPuente;
import com.cyad.producciones.entity.ERevista;
import com.cyad.producciones.entity.ERolParticipacion;
import com.cyad.producciones.entity.ETipoDesarrollo;
import com.cyad.producciones.model.MArticulo;
import com.cyad.producciones.model.MArticuloPalabrasPuente;
import com.cyad.producciones.model.MAutor;
import com.cyad.producciones.model.MConferenciaPresentacion;
import com.cyad.producciones.model.MDesarrollo;
import com.cyad.producciones.model.MDocumentoReseñaPalabrasPuente;
import com.cyad.producciones.model.MDocumentoRespaldo;
import com.cyad.producciones.model.MDocumentos_Reseñas;
import com.cyad.producciones.model.MEditor;
import com.cyad.producciones.model.MInnovacion;
import com.cyad.producciones.model.MLibro;
import com.cyad.producciones.model.MLibroPalabrasPuente;
import com.cyad.producciones.model.MMemoria;
import com.cyad.producciones.model.MMemoriaPalabrasPuente;
import com.cyad.producciones.model.MOrden;
import com.cyad.producciones.model.MOrigenReporte;
import com.cyad.producciones.model.MPalabrasClave;
import com.cyad.producciones.model.MProduccionAcademicaArticulo;
import com.cyad.producciones.model.MProduccionAcademicaConferenciaPresentacion;
import com.cyad.producciones.model.MProduccionAcademicaDesarrollo;
import com.cyad.producciones.model.MProduccionAcademicaDocumentosReseña;
import com.cyad.producciones.model.MProduccionAcademicaInnovacion;
import com.cyad.producciones.model.MProduccionAcademicaLibro;
import com.cyad.producciones.model.MProduccionAcademicaMemoria;
import com.cyad.producciones.model.MProduccionAcademicaReporte;
import com.cyad.producciones.model.MReporte;
import com.cyad.producciones.model.MReportePalabrasPuente;
import com.cyad.producciones.model.MRevista;
import com.cyad.producciones.model.MRolParticipacion;
import com.cyad.producciones.model.MTipoDesarrollo;
import com.cyad.producciones.pdf.Reader;
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
 * Esta clase es el controlador principal REST almacena las rutas que se
 * utilizan para atender las peticiones HTTP
 * 
 * @author Salvador Solis Atenco
 * @author Enrique Ramírez Martínez
 *
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200") // permisos CORS a la ruta por defecto de la apliccion de Angular
@RequestMapping("/v1")
public class ControlRest {

	@Autowired
	@Qualifier("servicio_becas")
	BecasService service_beca;

	@Autowired
	@Qualifier("servicio_AlumnoBeca")
	AlumnoBecaService service_alumnoBeca;

	@Autowired
	@Qualifier("servicio_profesor")
	ProfesorService service_prof;

	@Autowired
	@Qualifier("servicio_departamento")
	DepartamentoService service_depto;

	@Autowired
	@Qualifier("servicio_division")
	DivisionService service_div;

	@Autowired
	@Qualifier("servicio_institucion")
	InstitucionService service_ins;

	@Autowired
	@Qualifier("servicio_area_investigacion")
	AreaInvestigacionService servicio_area_investigacion;

	@Autowired
	@Qualifier("servicio_alumno")
	AlumnoService service_alum;

	@Autowired
	@Qualifier("servicio_direccion")
	DireccionService service_direc;

	@Autowired
	@Qualifier("servicio_correo")
	CorreoService service_correo;

	@Autowired
	@Qualifier("servicio_area_concentracion")
	AreaConcentracionService servicio_area_concentracion;

	@Autowired
	@Qualifier("servicio_datos_academicos")
	DatosAcademicosService service_datos;

	@Autowired
	@Qualifier("servicio_estado_academico")
	EstadoAcademicoService service_estado;

	@Autowired
	@Qualifier("servicio_plan")
	PlanService service_plan;

	@Autowired
	@Qualifier("servicio_nivel")
	NivelService service_nivel;

	@Autowired
	@Qualifier("servicio_proyecto")
	ProyectoService service_proyecto;

	@Autowired
	@Qualifier("servicio_tipo_proyecto")
	TipoProyectoService service_tipo_proyecto;

	@Autowired
	@Qualifier("servicio_grupo_protocolo")
	GrupoProtocoloService service_grupo_protocolo;

	@Autowired
	@Qualifier("servicio_participante")
	ParticipanteService service_participante;

	@Autowired
	@Qualifier("servicio_tipo_participante")
	TipoParticipanteService service_tipo_participante;

	@Autowired
	@Qualifier("servicio_rol")
	RolService service_rol;

	@Autowired
	@Qualifier("servicio_datos_ingreso")
	DatosIngresoService servicio_datos_ingreso;

	@Autowired
	@Qualifier("servicio_adeudos")
	AdeudoService servicio_adeudos;

	@Autowired
	@Qualifier("servicio_aspirante")
	AspiranteService servicio_aspirante;

	@Autowired
	@Qualifier("servicio_adeudo_aspirante")
	AdeudoAspiranteService servicio_adeudo_aspirante;

	@Autowired
	@Qualifier("servicio_estado_aspirante")
	EstadoAspiranteService servicio_estado_aspirante;

	@Autowired
	@Qualifier("servicio_trimestres")
	TrimestreService servicio_trimestres;

	@Autowired
	@Qualifier("servicio_dedicacion")
	DedicacionService servicio_dedicacion;

	@Autowired
	@Qualifier("servicio_telefono")
	TelefonoService servicio_telefono;

	@Autowired
	@Qualifier("servicio_identificadores_investigacion")
	Identificadores_InvestigacionService servicio_identificadores;

	// Parte de producciones
	@Autowired
	@Qualifier("servicio_articulo")
	ArticuloService servicio_articulos;

	@Autowired
	@Qualifier("servicio_revistas")
	RevistasService servicio_revistas;

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

	
	// READER//
	@Autowired
	@Qualifier("servicio_reader")
	Reader reader;
	// termino reader
	
	// termino de producciones

	@Autowired
	@Qualifier("servicio_AlumnoIdentificador")
	AlumnoIdentificadorService servicio_alumnoIdentificador;

	@Autowired
	@Qualifier("servicio_profesorIdentificador")
	ProfesorIdentificadorService servicio_profesorIdentificador;

	// ------Profesor
	// obtener
	@GetMapping("/profesores")
	public List<MProfesor> obtenerProfesores() {
		return service_prof.obtener();
	}

	// obtener
	@GetMapping("/profesor/{id}")
	public MProfesor obtenerProfesores(@PathVariable("id") long id) {
		return service_prof.obtener(id);
	}

	// insertar
	@PostMapping("/profesor")
	public boolean agregarProfesor(@RequestBody @Validated EProfesor prof) {
		return service_prof.crear(prof);
	}

	// actualizar
	@PutMapping("/profesorUpdate")
	public boolean actualizarProfesor(@RequestBody @Validated EProfesor prof) {
		return service_prof.actualizar(prof);
	}

	// borrar
	@DeleteMapping("/profesor")
	public boolean borrarProfesor(@RequestParam("id") long id) {
		return service_prof.borrar(id);
	}

	// ------Departamento

	// obtener
	@GetMapping("/departamentos")
	public List<MDepartamento> obtenerDepartamentos() {
		return service_depto.obtener();
	}

	// obtener
	@GetMapping("/departamento/{id}")
	public MDepartamento obtenerDepartamento(@PathVariable("id") long id) {
		return service_depto.obtener(id);
	}

	// insertar
	@PostMapping("/departamento")
	public boolean agregarDepartamento(@RequestBody @Validated EDepartamento depto) {
		return service_depto.crear(depto);
	}

	// actualizar
	@PutMapping("/departamentoUpdate")
	public boolean actualizarDepartamento(@RequestBody @Validated EDepartamento depto) {
		return service_depto.actualizar(depto);
	}

	// borrar
	@DeleteMapping("/departamento")
	public boolean borrarDepartamento(@RequestParam("id") long id) {
		return service_depto.borrar(id);
	}

	// ------Division

	// obtener
	@GetMapping("/divisiones")
	public List<MDivision> obtenerDivisiones() {
		return service_div.obtener();
	}

	// insertar
	@PostMapping("/division")
	public boolean agregarDivision(@RequestBody @Validated EDivision div) {
		return service_div.crear(div);
	}

	// actualizar
	@PutMapping("/divisionUpdate")
	public boolean actualizarDivision(@RequestBody @Validated EDivision div) {
		return service_div.actualizar(div);
	}

	// borrar
	@DeleteMapping("/division")
	public boolean borrarDivision(@RequestParam("id") long id) {
		return service_div.borrar(id);
	}

	// ------Institucion

	// obtener
	@GetMapping("/instituciones")
	public List<MInstitucion> obtenerInstituciones() {
		return service_ins.obtener();
	}

	// obtener
	@GetMapping("/institucion/{id}")
	public MInstitucion obtenerInstituciones(@PathVariable("id") long id) {
		return service_ins.obtener(id);
	}

	// insertar
	@PostMapping("/institucion")
	public boolean agregarInstitucion(@RequestBody @Validated EInstitucion inst) {
		return service_ins.crear(inst);
	}

	// actualizar
	@PutMapping("/institucionUpdate")
	public boolean actualizarDivision(@RequestBody @Validated EInstitucion inst) {
		return service_ins.actualizar(inst);
	}

	// borrar
	@DeleteMapping("/institucion")
	public boolean borrarinstitucion(@RequestParam("id") long id) {
		return service_ins.borrar(id);
	}

	// ------Area Investigacion

	// obtener
	@GetMapping("/areas-investigacion")
	public List<MAreaInvestigacion> obtenerAreasInvestigacion() {
		return servicio_area_investigacion.obtener();
	}

	// obtener
	@GetMapping("/area-investigacion/{id}")
	public MAreaInvestigacion obtenerAreaInvestigacion(@PathVariable("id") long id) {
		return servicio_area_investigacion.obtener(id);
	}

	// insertar
	@PostMapping("/area-investigacion")
	public boolean agregarAreaInvestigacion(@RequestBody @Validated EAreaInvestigacion area) {
		return servicio_area_investigacion.crear(area);
	}

	// actualizar
	@PutMapping("/area-investigacionUpdate")
	public boolean actualizarAreaInvestigacion(@RequestBody @Validated EAreaInvestigacion area) {
		return servicio_area_investigacion.actualizar(area);
	}

	// borrar
	@DeleteMapping("/area-investigacion")
	public boolean borrarAreaInvestigacion(@RequestParam("id") long id) {
		return servicio_area_investigacion.borrar(id);
	}

	// ------Alumno
	// obtener
	@GetMapping("/alumnos")
	public List<MAlumno> obtenerAlumnos() {
		return service_alum.obtener();
	}

	// obtener
	@GetMapping("/alumno/{id}")
	public MAlumno obtenerAlumnos(@PathVariable("id") long id) {
		return service_alum.obtener(id);
	}

	// insertar
	@PostMapping("/alumno")
	public long agregarAlumno(@RequestBody @Validated EAlumno alumn) {
		return service_alum.crear(alumn);
	}

	// actualizar
	@PutMapping("/alumnoUpdate")
	public boolean actualizarAlumno(@RequestBody @Validated EAlumno alumn) {
		return service_alum.actualizar(alumn);
	}

	// borrar
	@DeleteMapping("/alumno")
	public boolean borrarAlumno(@RequestParam("id") long id) {
		return service_alum.borrar(id);
	}

	// ------Direccion
	// obtener
	@GetMapping("/direcciones")
	public List<MDireccion> obtenerDirecciones() {
		return service_direc.obtener();
	}

	// obtener
	@GetMapping("/direccion/{id}")
	public MDireccion obtenerDirecciones(@PathVariable("id") long id) {
		return service_direc.obtener(id);
	}

	// obtener
	@GetMapping("/direccion-alumno/{id}")
	public MDireccion obtenerDireccionAlumno(@PathVariable("id") long id) {
		return service_direc.obtenerDireccionAlumno(id);
	}

	// insertar
	@PostMapping("/direccion")
	public boolean agregarDireccion(@RequestBody @Validated EDireccion direc) {
		return service_direc.crear(direc);
	}

	// actualizar
	@PutMapping("/direccionUpdate")
	public boolean actualizarDireccion(@RequestBody @Validated EDireccion direc) {
		return service_direc.actualizar(direc);
	}

	// borrar
	@DeleteMapping("/direccion")
	public boolean borrarDireccion(@RequestParam("id") long id) {
		return service_direc.borrar(id);
	}

	// borrar
	@DeleteMapping("/direccion-coincidir")
	public boolean borrarDireccion(@RequestParam("calle") String calle, @RequestParam("numero") int numero,
			@RequestParam("id") long id) {
		return service_direc.borrar_coincidir(calle, numero, id);
	}

	// ------Correo
	// obtener
	@GetMapping("/correos")
	public List<MCorreo> obtenerCorreos() {
		return service_correo.obtener();
	}

	// obtener
	@GetMapping("/correos/{id}")
	public MCorreo obtenerCorreos(@PathVariable("id") long id) {
		return service_correo.obtener(id);
	}

	// obtener
	@GetMapping("/correos-alumno/{id}")
	public List<MCorreo> obtenerCorreosAlumno(@PathVariable("id") long id) {
		return service_correo.obtenerByAlumno(id);
	}

	// insertar
	@PostMapping("/correo")
	public boolean agregarDireccion(@RequestBody @Validated ECorreo correo) {
		return service_correo.crear(correo);
	}

	// actualizar
	@PutMapping("/correoUpdate")
	public boolean actualizarDireccion(@RequestBody @Validated ECorreo correo) {
		return service_correo.actualizar(correo);
	}

	// borrar
	@DeleteMapping("/correo")
	public boolean borrarCorreo(@RequestParam("id") long id) {
		return service_correo.borrar(id);
	}

	// borrar
	@DeleteMapping("/correo-coincidir")
	public boolean borrarCorreo(@RequestParam("correo") String correo, @RequestParam("tipo") String tipo,
			@RequestParam("id") long id) {
		return service_correo.borrar_coincidir(correo, tipo, id);
	}

	// ------Datos Academicos
	// obtener
	@GetMapping("/datos")
	public List<MDatosAcademicos> obtenerDatosAcademicos() {
		return service_datos.obtener();
	}

	// obtener
	@GetMapping("/datos/{id}")
	public MDatosAcademicos obtenerDatosAcademicos(@PathVariable("id") long id) {
		return service_datos.obtener(id);
	}

	// insertar
	@PostMapping("/dato")
	public boolean agregarDatosAcademicos(@RequestBody @Validated EDatosAcademicos datos) {
		return service_datos.crear(datos);
	}

	// actualizar
	@PutMapping("/datoUpdate")
	public boolean actualizarDatosAcademicos(@RequestBody @Validated EDatosAcademicos datos) {
		return service_datos.actualizar(datos);
	}

	// borrar
	@DeleteMapping("/dato")
	public boolean borrarDatosAcademicos(@RequestParam("id") long id) {
		return service_datos.borrar(id);
	}

	// ------Estado Academico
	// obtener
	@GetMapping("/estados")
	public List<MEstadoAcademico> obtenerEstadoAcademico() {
		return service_estado.obtener();
	}

	// obtener
	@GetMapping("/estado/{id}")
	public MEstadoAcademico obtenerEstadoAcademico(@PathVariable("id") long id) {
		return service_estado.obtener(id);
	}

	// insertar
	@PostMapping("/estado")
	public boolean agregarEstadoAcademico(@RequestBody @Validated EEstadoAcademico estado) {
		return service_estado.crear(estado);
	}

	// actualizar
	@PutMapping("/estadoUpdate")
	public boolean actualizarEstadoAcademico(@RequestBody @Validated EEstadoAcademico estado) {
		return service_estado.actualizar(estado);
	}

	// borrar
	@DeleteMapping("/estado")
	public boolean borrarEstadoAcademico(@RequestParam("id") long id) {
		return service_estado.borrar(id);
	}

	// ------Area Concentracion
	// obtener
	@GetMapping("/areas-concentracion")
	public List<MAreaConcentracion> obtenerAreasConcentracion() {
		return servicio_area_concentracion.obtener();
	}

	// obtener
	@GetMapping("/area-concentracion/{id}")
	public MAreaConcentracion obtenerAreaConcentracion(@PathVariable("id") long id) {
		return servicio_area_concentracion.obtener(id);
	}

	// insertar
	@PostMapping("/area-concentracion")
	public boolean agregarAreaConcentracion(@RequestBody @Validated EAreaConcentracion area) {
		return servicio_area_concentracion.crear(area);
	}

	// actualizar
	@PutMapping("/area-concentracionUpdate")
	public boolean actualizarAreaConcentracion(@RequestBody @Validated EAreaConcentracion area) {
		return servicio_area_concentracion.actualizar(area);
	}

	// borrar
	@DeleteMapping("/area-concentracion")
	public boolean borrarAreaConcentracion(@RequestParam("id") long id) {
		return servicio_area_concentracion.borrar(id);
	}

	// ------Plan

	// obtener
	@GetMapping("/planes")
	public List<MPlan> obtenerPlanes() {
		return service_plan.obtener();
	}

	// obtener
	@GetMapping("/plan/{id}")
	public MPlan obtenerPlanes(@PathVariable("id") long id) {
		return service_plan.obtener(id);
	}

	// insertar
	@PostMapping("/plan")
	public boolean agregarPlan(@RequestBody @Validated EPlan plan) {
		return service_plan.crear(plan);
	}

	// actualizar
	@PutMapping("/planUpdate")
	public boolean actualizarPlan(@RequestBody @Validated EPlan plan) {
		return service_plan.actualizar(plan);
	}

	// borrar
	@DeleteMapping("/plan")
	public boolean borrarPlan(@RequestParam("id") long id) {
		return service_plan.borrar(id);
	}

	// ------Nivel

	// obtener
	@GetMapping("/niveles")
	public List<MNivel> obtenerNiveles() {
		return service_nivel.obtener();
	}

	// obtener
	@GetMapping("/nivel/{id}")
	public MNivel obtenerNiveles(@PathVariable("id") long id) {
		return service_nivel.obtener(id);
	}

	// insertar
	@PostMapping("/nivel")
	public boolean agregarNivel(@RequestBody @Validated ENivel nivel) {
		return service_nivel.crear(nivel);
	}

	// actualizar
	@PutMapping("/nivelUpdate")
	public boolean actualizarNivel(@RequestBody @Validated ENivel nivel) {
		return service_nivel.actualizar(nivel);
	}

	// borrar
	@DeleteMapping("/nivel")
	public boolean borrarNivel(@RequestParam("id") long id) {
		return service_nivel.borrar(id);
	}

	// ------Proyecto

	// obtener
	@GetMapping("/proyectos")
	public List<MProyecto> obtenerProyectos() {
		return service_proyecto.obtener();
	}

	// obtener
	@GetMapping("/proyecto/{id}")
	public MProyecto obtenerProyectos(@PathVariable("id") long id) {
		return service_proyecto.obtener(id);
	}

	// insertar
	@PostMapping("/proyecto")
	public boolean agregarProyecto(@RequestBody @Validated EProyecto proyecto) {
		return service_proyecto.crear(proyecto);
	}

	// actualizar
	@PutMapping("/proyectoUpdate")
	public boolean actualizarProyecto(@RequestBody @Validated EProyecto proyecto) {
		return service_proyecto.actualizar(proyecto);
	}

	// borrar
	@DeleteMapping("/proyecto")
	public boolean borrarProyecto(@RequestParam("id") long id) {
		return service_proyecto.borrar(id);
	}

	// ------Tipo Proyecto

	// obtener
	@GetMapping("/tiposProyectos")
	public List<MTipoProyecto> obtenerTipoProyectos() {
		return service_tipo_proyecto.obtener();
	}

	// obtener
	@GetMapping("/tipoProyecto/{id}")
	public MTipoProyecto obtenerTipoProyectos(@PathVariable("id") long id) {
		return service_tipo_proyecto.obtener(id);
	}

	// insertar
	@PostMapping("/tipoProyecto")
	public boolean agregarTipoProyecto(@RequestBody @Validated ETipoProyecto t_proyecto) {
		return service_tipo_proyecto.crear(t_proyecto);
	}

	// actualizar
	@PutMapping("/tipoProyectoUpdate")
	public boolean actualizarTipoProyecto(@RequestBody @Validated ETipoProyecto t_proyecto) {
		return service_tipo_proyecto.actualizar(t_proyecto);
	}

	// borrar
	@DeleteMapping("/tipoProyecto")
	public boolean borrarTipoProyecto(@RequestParam("id") long id) {
		return service_tipo_proyecto.borrar(id);
	}

	// ------Grupo protocolo

	// obtener
	@GetMapping("/gruposProtocolo")
	public List<MGrupoProtocolo> obtenerGruposProtocolo() {
		return service_grupo_protocolo.obtener();
	}

	@GetMapping("/grupoProtocolo/{id}")
	public MGrupoProtocolo obtenerGruposProtocolo(@PathVariable("id") long id) {
		return service_grupo_protocolo.obtener(id);
	}

	// insertar
	@PostMapping("/newgrupoProtocolo")
	public MGrupoProtocolo crearGrupoProtocolo() {
		return service_grupo_protocolo.crear();
	}

	// insertar
	@PostMapping("/grupoProtocolo")
	public boolean agregarGrupoProtocolo(@RequestBody @Validated EGrupoProtocolo g_protocolo) {
		return service_grupo_protocolo.crear(g_protocolo);
	}

	// actualizar
	@PutMapping("/grupoProtocoloUpdate")
	public boolean actualizarGrupoProtocolo(@RequestBody @Validated EGrupoProtocolo g_protocolo) {
		return service_grupo_protocolo.actualizar(g_protocolo);
	}

	// borrar
	@DeleteMapping("/grupoProtocolo")
	public boolean borrarGrupoProtocolo(@RequestParam("id") long id) {
		return service_grupo_protocolo.borrar(id);
	}

	// ------Participantes

	// obtener
	@GetMapping("/participantes")
	public List<MParticipante> obtenerParticipantes() {
		return service_participante.obtener();
	}

	// obtener
	@GetMapping("/participante/{id}")
	public MParticipante obtenerParticipantes(@PathVariable("id") long id) {
		return service_participante.obtener(id);
	}

	// insertar
	@PostMapping("/participante")
	public boolean agregarParticipante(@RequestBody @Validated EParticipante participante) {
		return service_participante.crear(participante);
	}

	// actualizar
	@PutMapping("/participanteUpdate")
	public boolean actualizarParticipante(@RequestBody @Validated EParticipante participante) {
		return service_participante.actualizar(participante);
	}

	// borrar
	@DeleteMapping("/participante")
	public boolean borrarParticipante(@RequestParam("id") long id) {
		return service_participante.borrar(id);
	}

	// ------Tipo de Participantes

	// obtener
	@GetMapping("/tiposParticipantes")
	public List<MTipoParticipante> obtenerTipoParticipantes() {
		return service_tipo_participante.obtener();
	}

	// obtener
	@GetMapping("/tiposParticipantes/{id}")
	public MTipoParticipante obtenerTipoParticipantes(@PathVariable("id") long id) {
		return service_tipo_participante.obtener(id);
	}

	// insertar
	@PostMapping("/tipoParticipante")
	public boolean agregarTipoParticipante(@RequestBody @Validated ETipoParticipante tparticipante) {
		return service_tipo_participante.crear(tparticipante);
	}

	// actualizar
	@PutMapping("/tipoParticipanteUpdate")
	public boolean actualizarTipoParticipante(@RequestBody @Validated ETipoParticipante tparticipante) {
		return service_tipo_participante.actualizar(tparticipante);
	}

	// borrar
	@DeleteMapping("/tipoParticipante")
	public boolean borrarTipoParticipante(@RequestParam("id") long id) {
		return service_tipo_participante.borrar(id);
	}

	// ------Rol de Participantes

	// obtener
	@GetMapping("/rolParticipantes")
	public List<MRol> obtenerRolParticipantes() {
		return service_rol.obtener();
	}

	// obtener
	@GetMapping("/rolParticipantes/{id}")
	public MRol obtenerRolParticipantes(@PathVariable("id") long id) {
		return service_rol.obtener(id);
	}

	// insertar
	@PostMapping("/rolParticipante")
	public boolean agregarRolParticipante(@RequestBody @Validated ERol rol) {
		return service_rol.crear(rol);
	}

	// actualizar
	@PutMapping("/rolParticipanteUpdate")
	public boolean actualizarRolParticipante(@RequestBody @Validated ERol rol) {
		return service_rol.actualizar(rol);
	}

	// borrar
	@DeleteMapping("/rolParticipante")
	public boolean borrarRolParticipante(@RequestParam("id") long id) {
		return service_rol.borrar(id);
	}

	// ------Datos de Ingreso

	// obtener
	@GetMapping("/datosIngresos")
	public List<MDatosIngreso> obtenerDatosIngresos() {
		return servicio_datos_ingreso.obtener();
	}

	// obtener
	@GetMapping("/datosIngreso/{id}")
	public MDatosIngreso obtenerDatosIngresos(@PathVariable("id") long id) {
		return servicio_datos_ingreso.obtener(id);
	}

	// insertar
	@PostMapping("/datosIngreso")
	public boolean agregarDatosIngreso(@RequestBody @Validated EDatosIngreso datos) {
		return servicio_datos_ingreso.crear(datos);
	}

	// actualizar
	@PutMapping("/datosIngresoUpdate")
	public boolean actualizarDatosIngreso(@RequestBody @Validated EDatosIngreso datos) {
		return servicio_datos_ingreso.actualizar(datos);
	}

	// borrar
	@DeleteMapping("/datosIngreso")
	public boolean borrarDatosIngreso(@RequestParam("id") long id) {
		return servicio_datos_ingreso.borrar(id);
	}

	// ------ Adeudos

	// obtener
	@GetMapping("/adeudos")
	public List<MAdeudo> obtenerAdeudos() {
		return servicio_adeudos.obtener();
	}

	// insertar
	@PostMapping("/adeudo")
	public boolean agregarAdeudo(@RequestBody @Validated EAdeudo adeudo) {
		return servicio_adeudos.crear(adeudo);
	}

	// actualizar
	@PutMapping("/adeudoUpdate")
	public boolean actualizarAdeudo(@RequestBody @Validated EAdeudo adeudo) {
		return servicio_adeudos.actualizar(adeudo);
	}

	// borrar
	@DeleteMapping("/adeudo/{id}")
	public boolean borrarAdeudo(@PathVariable("id") long id) {
		return servicio_adeudos.borrar(id);
	}

	// ------ Aspirante

	// obtener
	@GetMapping("/aspirantes")
	public List<MAspirante> obtenerAspirantes() {
		return servicio_aspirante.obtener();
	}

	@GetMapping("/aspirante/{id}")
	public MAspirante obtenerAspirantes(@PathVariable("id") long id) {
		return servicio_aspirante.obtener(id);
	}

	// insertar
	@PostMapping("/aspirante")
	public boolean agregarAspirante(@RequestBody @Validated EAspirante aspirante) {
		return servicio_aspirante.crear(aspirante);
	}

	// actualizar
	@PutMapping("/aspiranteUpdate")
	public boolean actualizarAspirante(@RequestBody @Validated EAspirante aspirante) {
		return servicio_aspirante.actualizar(aspirante);
	}

	// borrar
	@DeleteMapping("/aspirante")
	public boolean borrarAspirante(@RequestParam("id") long id) {
		return servicio_aspirante.borrar(id);
	}

	// ------ Estado Aspirante

	// obtener
	@GetMapping("/estados-aspirantes")
	public List<MEstadoAspirante> obtenerEstadosAspirantes() {
		return servicio_estado_aspirante.obtener();
	}

	// obtener
	@GetMapping("/estado-aspirante/{id}")
	public MEstadoAspirante obtenerEstadoAspirante(@PathVariable("id") long id) {
		return servicio_estado_aspirante.obtener(id);
	}

	// insertar
	@PostMapping("/estado-aspirante")
	public boolean agregarEstadoAspirante(@RequestBody @Validated EEstadoAspirante estado) {
		return servicio_estado_aspirante.crear(estado);
	}

	// actualizar
	@PutMapping("/estado-aspiranteUpdate")
	public boolean actualizarEstadoAspirante(@RequestBody @Validated EEstadoAspirante estado) {
		return servicio_estado_aspirante.actualizar(estado);
	}

	// borrar
	@DeleteMapping("/estado-aspirante")
	public boolean borrarEstadoAspirante(@RequestParam("id") long id) {
		return servicio_estado_aspirante.borrar(id);
	}

	// ------ Adeudo Aspirante

	// obtener
	@GetMapping("/adeudosAspirantes")
	public List<MAdeudoAspirante> obtenerAdeudoAspirantes() {
		return servicio_adeudo_aspirante.obtener();
	}

	// insertar
	@PutMapping("/adeudoAspirante")
	public boolean agregarAdeudoAspirante(@RequestBody @Validated EAdeudoAspirante adeudo_aspirante) {
		return servicio_adeudo_aspirante.crear(adeudo_aspirante);
	}

	// actualizar
	@PostMapping("/adeudoAspiranteUpdate")
	public boolean actualizarAdeudoAspirante(@RequestBody @Validated EAdeudoAspirante adeudo_aspirante) {
		return servicio_adeudo_aspirante.actualizar(adeudo_aspirante);
	}

	// borrar
	@DeleteMapping("/adeudoAspirante/{id}")
	public boolean borrarAdeudoAspirante(@PathVariable("id") long id) {
		return servicio_adeudo_aspirante.borrar(id);
	}

	// ------Trimestress

	// obtener
	@GetMapping("/trimestres")
	public List<MTrimestre> obtenerTrimestres() {
		return servicio_trimestres.obtener();
	}

	// obtener
	@GetMapping("/trimestre/{id}")
	public MTrimestre obtenerTrimestre(@PathVariable("id") long id) {
		return servicio_trimestres.obtener(id);
	}

	// insertar
	@PostMapping("/trimestre")
	public boolean agregarTrimestre(@RequestBody @Validated ETrimestre trimestre) {
		return servicio_trimestres.crear(trimestre);
	}

	// actualizar
	@PutMapping("/trimestreUpdate")
	public boolean actualizarTrimestre(@RequestBody @Validated ETrimestre trimestre) {
		return servicio_trimestres.actualizar(trimestre);
	}

	// borrar
	@DeleteMapping("/trimestre")
	public boolean borrarTrimestre(@RequestParam("id") long id) {
		return servicio_trimestres.borrar(id);
	}

	// datamart
	// ------------------------------------------------------------------------------------------------------------------------

	@Autowired
	@Qualifier("data_alumno_service")
	AlumnoServiceDatamart servicio_alumno_data;

	// --------------------------------------------alumnos
	// obtener
	@GetMapping("/datamart/alumnos")
	public List<com.cyad.datamart.model.MAlumnoDatamart> obtenerAlumnosDatamart() {
		return servicio_alumno_data.obtener();
	}

	// obtener
	@GetMapping("/datamart/alumno/{id}")
	public com.cyad.datamart.model.MAlumnoDatamart obtenerAlumnoDetailDatamart(@PathVariable("id") long id) {
		return servicio_alumno_data.obtener(id);
	}

	// Servicio creado por Enrique como prueba
	// -------------------------Becas--------------------
	// obtener
	@GetMapping("/becas")
	public List<MBecas> obtenerBecas() {
		return service_beca.obtener();
	}

	// obtener
	@GetMapping("/beca/{id}")
	public MBecas obtenerBecas(@PathVariable("id") long id) {
		return service_beca.obtener(id);
	}

	// insertar
	@PostMapping("/beca")
	public boolean agregarBeca(@RequestBody @Validated EBecas beca) {
		return service_beca.crear(beca);
	}

	// actualizar
	@PutMapping("/becaUpdate")
	public boolean actualizarBeca(@RequestBody @Validated EBecas beca) {
		return service_beca.actualizar(beca);
	}

	// borrar
	@DeleteMapping("/becaDelete")
	public boolean borrarBeca(@RequestParam("id") long id) {
		return service_beca.borrar(id);
	}

	// -------------------Alumno Beca--------------------
	// obtener
	@GetMapping("/AlumnoBecas")
	public List<MAlumnoBeca> obtenerBecasAsignadas() {
		return service_alumnoBeca.obtener();
	}

	// obtener
	@GetMapping("/AlumnoBeca/{id}")
	public MAlumnoBeca obtenerBecasAsignadas(@PathVariable("id") long id) {
		return service_alumnoBeca.obtener(id);
	}

	// insertar
	@PostMapping("/AlumnoBeca")
	public boolean agregarBecaAsignada(@RequestBody @Validated EAlumnoBeca beca) {
		return service_alumnoBeca.crear(beca);
	}

	// actualizar
	@PutMapping("/AlumnoBecaUpdate")
	public boolean actualizarBecaAsignada(@RequestBody @Validated EAlumnoBeca beca) {
		return service_alumnoBeca.actualizar(beca);
	}

	// borrar
	@DeleteMapping("/AlumnoBecaDelete")
	public boolean borrarBecaAsignada(@RequestParam("id") long id) {
		return service_alumnoBeca.borrar(id);
	}

	// Servicio creado por Enrique como prueba
	// -------------------------Dedicacion--------------------
	// obtener
	@GetMapping("/dedicaciones")
	public List<MDedicacion> obtenerDedicaciones() {
		return servicio_dedicacion.obtener();
	}

	// obtener
	@GetMapping("/dedicacion/{id}")
	public MDedicacion obtenerDedicacion(@PathVariable("id") long id) {
		return servicio_dedicacion.obtener(id);
	}

	// insertar
	@PostMapping("/dedicacion")
	public boolean agregarDedicacion(@RequestBody @Validated EDedicacion dedicacion) {
		return servicio_dedicacion.crear(dedicacion);
	}

	// actualizar
	@PutMapping("/dedicacionUpdate")
	public boolean actualizarDedicacion(@RequestBody @Validated EDedicacion dedicacion) {
		return servicio_dedicacion.actualizar(dedicacion);
	}

	// borrar
	@DeleteMapping("/dedicacionDelete/{id}")
	public boolean borrarDedicacion(@RequestParam("id") long id) {
		return servicio_dedicacion.borrar(id);
	}

	// Servicio creado por Enrique como prueba
	// -------------------------Telefono--------------------
	// obtener
	@GetMapping("/telefonos")
	public List<MTelefono> obtenerTelefonos() {
		return servicio_telefono.obtener();
	}

	// obtener
	@GetMapping("/telefono/{id}")
	public MTelefono obtenerTelefono(@PathVariable("id") long id) {
		return servicio_telefono.obtener(id);
	}

	// insertar
	@PostMapping("/telefono")
	public boolean agregarTelefono(@RequestBody @Validated ETelefono telefono) {
		return servicio_telefono.crear(telefono);
	}

	// actualizar
	@PutMapping("/telefonoUpdate")
	public boolean actualizarTelefono(@RequestBody @Validated ETelefono telefono) {
		return servicio_telefono.actualizar(telefono);
	}

	// borrar
	@DeleteMapping("/telefonoDelete")
	public boolean borrarTelefono(@RequestParam("id") long id) {
		return servicio_telefono.borrar(id);
	}

	// Servicio creado por Enrique como prueba
	// -------------------------Identificadores_Investigacion--------------------
	// obtener
	@GetMapping("/Identificadores_investigacion")
	public List<MIdentificadores_Investigacion> obtenerIdentificadores() {
		return servicio_identificadores.obtener();
	}

	// obtener
	@GetMapping("/Identificador_investigacion/{id}")
	public MIdentificadores_Investigacion obtenerIdentificador(@PathVariable("id") long id) {
		return servicio_identificadores.obtener(id);
	}

	// insertar
	@PostMapping("/Identificador_investigacion")
	public boolean agregarIdentificador(@RequestBody @Validated EIdentificadores_Investigacion identificador) {
		return servicio_identificadores.crear(identificador);
	}

	// actualizar
	@PutMapping("/Identificador_investigacionUpdate")
	public boolean actualizarIdentificador(@RequestBody @Validated EIdentificadores_Investigacion identificador) {
		return servicio_identificadores.actualizar(identificador);
	}

	// borrar
	@DeleteMapping("/Identificador_investigacionDelete")
	public boolean borrarIdentificador(@RequestParam("id") long id) {
		return servicio_identificadores.borrar(id);
	}

	// Servicio creado por Enrique como prueba
	// -------------------------Alumno_Identificadores_Investigacion--------------------
	// obtener
	@GetMapping("/AlumnoIdentificadores_investigacion")
	public List<MAlumno_Identificador_puente> obtenerIdentificadoresAlumno() {
		return servicio_alumnoIdentificador.obtener();
	}

	// obtener
	@GetMapping("/AlumnoIdentificador_investigacion/{id}")
	public MAlumno_Identificador_puente obtenerIdentificadorAlumno(@PathVariable("id") long id) {
		return servicio_alumnoIdentificador.obtener(id);
	}

	// insertar
	@PostMapping("/Alumnoidentificador_investigacion")
	public boolean agregarIdentificadorAlumno(
			@RequestBody @Validated EAlumno_Identificador_puente Alumnoidentificador) {
		return servicio_alumnoIdentificador.crear(Alumnoidentificador);
	}

	// actualizar
	@PutMapping("/Alumnoidentificador_investigacionUpdate")
	public boolean actualizarAlunoIdentificador(
			@RequestBody @Validated EAlumno_Identificador_puente Alumnoidentificador) {
		return servicio_alumnoIdentificador.actualizar(Alumnoidentificador);
	}

	// borrar
	@DeleteMapping("/Alumnoidentificador_investigacionDelete")
	public boolean borrarIdentificadorAlumno(@RequestParam("id") long id) {
		return servicio_alumnoIdentificador.borrar(id);
	}

	// -------------------------Profesor_Identificadores_Investigacion--------------------
	// obtener
	@GetMapping("/ProfesorIdentificadores_Investigacion")
	public List<MProfesor_Identificador_puente> obtenerIdentificadoresProfesor() {
		return servicio_profesorIdentificador.obtener();
	}

	// obtener
	@GetMapping("/ProfesorIdentificador_investigacion/{id}")
	public MProfesor_Identificador_puente obtenerIdentificadorProfesor(@PathVariable("id") long id) {
		return servicio_profesorIdentificador.obtener(id);
	}

	// insertar
	@PostMapping("/Profesoridentificador_investigacion")
	public boolean agregarIdentificadorProfesor(
			@RequestBody @Validated EProfesor_Identificador_puente Profesoridentificador) {
		return servicio_profesorIdentificador.crear(Profesoridentificador);
	}

	// actualizar
	@PutMapping("/Profesoridentificador_investigacionUpdate")
	public boolean actualizarProfesorIdentificador(
			@RequestBody @Validated EProfesor_Identificador_puente Profesoridentificador) {
		return servicio_profesorIdentificador.actualizar(Profesoridentificador);
	}

	// borrar
	@DeleteMapping("/Profesoridentificador_investigacionDelete")
	public boolean borrarIdentificadorProfesor(@RequestParam("id") long id) {
		return servicio_profesorIdentificador.borrar(id);
	}

	// -------------------------Articulos--------------------
	// obtener
	@GetMapping("/Articulos")
	public List<MArticulo> obtenerArticulos() {
		return servicio_articulos.obtener();
	}

	// obtener
	@GetMapping("/Articulo/{id}")
	public MArticulo obtenerArticulo(@PathVariable("id") long id) {
		return servicio_articulos.obtener(id);
	}

	// Buscar
	@GetMapping("/ArticuloFind")
	public MArticulo buscarArticulo(@RequestBody @Validated EArticulo articulo) {
		return servicio_articulos.buscar(articulo);
	}

	// insertar
	@PostMapping("/Articulo")
	public boolean agregarArticulo(@RequestBody @Validated EArticulo articulo) {
		return servicio_articulos.crear(articulo);
	}

	// actualizar
	@PutMapping("/ArticuloUpdate")
	public boolean actualizarArticulo(@RequestBody @Validated EArticulo articulo) {
		return servicio_articulos.actualizar(articulo);

	}

	// borrar
	@DeleteMapping("/ArticuloDelete")
	public boolean borrarArticulo(@RequestParam("id") long id) {
		return servicio_articulos.borrar(id);
	}

	// -------------------------Revistas--------------------
	// obtener
	@GetMapping("/Revistas")
	public List<MRevista> obtenerRevistas() {
		return servicio_revistas.obtener();
	}

	// obtener
	@GetMapping("/Revista/{id}")
	public MRevista obtenerRevista(@PathVariable("id") long id) {
		return servicio_revistas.obtener(id);
	}

	// insertar
	@PostMapping("/Revista")
	public boolean agregarRevista(@RequestBody @Validated ERevista revista) {
		return servicio_revistas.crear(revista);
	}

	// actualizar
	@PutMapping("/RevistaUpdate")
	public boolean actualizarRevista(@RequestBody @Validated ERevista revista) {
		return servicio_revistas.actualizar(revista);

	}

	// borrar
	@DeleteMapping("/RevistaDelete")
	public boolean borrarRevista(@RequestParam("id") long id) {
		return servicio_revistas.borrar(id);
	}

	// -------------------------Palabras clave--------------------
	// obtener
	@GetMapping("/PalabrasClave")
	public List<MPalabrasClave> obtenerPalabrasClave() {
		return servicio_palabras_clave.obtener();
	}

	// obtener
	@GetMapping("/PalabrasClave/{id}")
	public MPalabrasClave obtenerPalabraClave(@PathVariable("id") long id) {
		return servicio_palabras_clave.obtener(id);
	}

	// insertar
	@PostMapping("/PalabraClave")
	public boolean agregarPalabraClave(@RequestBody @Validated EPalabrasClave palabra) {
		return servicio_palabras_clave.crear(palabra);
	}

	// actualizar
	@PutMapping("/PalabraClaveUpdate")
	public boolean actualizarPalabraClave(@RequestBody @Validated EPalabrasClave palabra) {
		return servicio_palabras_clave.actualizar(palabra);

	}

	// borrar
	@DeleteMapping("/PalabraClaveDelete")
	public boolean borrarPalabraClave(@RequestParam("id") long id) {
		return servicio_palabras_clave.borrar(id);
	}

	// -------------------------Articulos palabras puente--------------------
	// obtener
	@GetMapping("/ArticulosPalabrasPuente")
	public List<MArticuloPalabrasPuente> obtenerArticulosPalabrasPuente() {
		return servicio_articulo_palabras_puente.obtener();
	}

	// obtener
	@GetMapping("/ArticuloPalabraPuente/{id}")
	public MArticuloPalabrasPuente obtenerArticuloPalabrapuente(@PathVariable("id") long id) {
		return servicio_articulo_palabras_puente.obtener(id);
	}

	// insertar
	@PostMapping("/ArticuloPalabraPuente")
	public boolean agregarArticuloPalabrapuente(@RequestBody @Validated EArticuloPalabrasPuente puente) {
		return servicio_articulo_palabras_puente.crear(puente);
	}

	// actualizar
	@PutMapping("/ArticuloPalabraclaveUpdate")
	public boolean actualizarArticulo(@RequestBody @Validated EArticuloPalabrasPuente puente) {
		return servicio_articulo_palabras_puente.actualizar(puente);

	}

	// borrar
	@DeleteMapping("/ArticuloPalabraPuenteDelete")
	public boolean borrarArticuloPalabraPuente(@RequestParam("id") long id) {
		return servicio_articulo_palabras_puente.borrar(id);
	}

	// -------------------------Libros--------------------
	// obtener
	@GetMapping("/Libros")
	public List<MLibro> obtenerLibros() {
		return servicio_libro.obtener();
	}

	// obtener
	@GetMapping("/Libro/{id}")
	public MLibro obtenerLibro(@PathVariable("id") long id) {
		return servicio_libro.obtener(id);
	}

	// Buscar
	@GetMapping("/LibroFind")
	public MLibro buscarLibro(@RequestBody @Validated ELibro libro) {
		return servicio_libro.buscar(libro);
	}

	// insertar
	@PostMapping("/Libro")
	public boolean agregarLibro(@RequestBody @Validated ELibro libro) {
		return servicio_libro.crear(libro);
	}

	// actualizar
	@PutMapping("/LibroUpdate")
	public boolean actualizarLibro(@RequestBody @Validated ELibro libro) {
		return servicio_libro.actualizar(libro);

	}

	// borrar
	@DeleteMapping("/LibroDelete")
	public boolean borrarLibro(@RequestParam("id") long id) {
		return servicio_libro.borrar(id);
	}

	// -------------------------Reportes--------------------
	// obtener
	@GetMapping("/Reportes")
	public List<MReporte> obtenerReportes() {
		return servicio_reporte.obtener();
	}

	// Buscar
	@GetMapping("/ReporteFind")
	public MReporte buscarReporte(@RequestBody @Validated EReporte reporte) {
		return servicio_reporte.buscar(reporte);
	}

	// obtener
	@GetMapping("/Reporte/{id}")
	public MReporte obtenerReporte(@PathVariable("id") long id) {
		return servicio_reporte.obtener(id);
	}

	// insertar
	@PostMapping("/Reporte")
	public boolean agregarReporte(@RequestBody @Validated EReporte reporte) {
		return servicio_reporte.crear(reporte);
	}

	// actualizar
	@PutMapping("/ReporteUpdate")
	public boolean actualizarReporte(@RequestBody @Validated EReporte reporte) {
		return servicio_reporte.actualizar(reporte);

	}

	// borrar
	@DeleteMapping("/ReporteDelete")
	public boolean borrarReporte(@RequestParam("id") long id) {
		return servicio_reporte.borrar(id);
	}

	// -------------------------Origen Reporte--------------------
	// obtener
	@GetMapping("/OrigenesReportes")
	public List<MOrigenReporte> obtenerOrigenesReportes() {
		return servicio_origen_reporte.obtener();
	}

	// obtener
	@GetMapping("/OrigenReporte/{id}")
	public MOrigenReporte obtenerOrigenReporte(@PathVariable("id") long id) {
		return servicio_origen_reporte.obtener(id);
	}

	// insertar
	@PostMapping("/OrigenReporte")
	public boolean agregarOrigenReporte(@RequestBody @Validated EOrigenReporte origen) {
		return servicio_origen_reporte.crear(origen);
	}

	// actualizar
	@PutMapping("/OrigenReporteUpdate")
	public boolean actualizarOrigenReporte(@RequestBody @Validated EOrigenReporte origen) {
		return servicio_origen_reporte.actualizar(origen);

	}

	// borrar
	@DeleteMapping("/OrigenReporteDelete")
	public boolean borrarOrigenReporte(@RequestParam("id") long id) {
		return servicio_origen_reporte.borrar(id);
	}

	// -------------------------Instituciones--------------------
	// obtener
	@GetMapping("/Instituciones2")
	public List<com.cyad.producciones.model.MInstitucion> obtenerInstituciones2() {
		return servicio_institucion.obtener();
	}

	// obtener
	@GetMapping("/Institucion2/{id}")
	public com.cyad.producciones.model.MInstitucion obtenerInstitucion2(@PathVariable("id") long id) {
		return servicio_institucion.obtener(id);
	}

	// insertar
	@PostMapping("/Institucion2")
	public boolean agregarInstitucion2(@RequestBody @Validated com.cyad.producciones.entity.EInstitucion institucion) {
		return servicio_institucion.crear(institucion);
	}

	// actualizar
	@PutMapping("/Institucion2Update")
	public boolean actualizarInstitucion2(
			@RequestBody @Validated com.cyad.producciones.entity.EInstitucion institucion) {
		return servicio_institucion.actualizar(institucion);

	}

	// borrar
	@DeleteMapping("/Institucion2Delete")
	public boolean borrarInstitucion2(@RequestParam("id") long id) {
		return servicio_institucion.borrar(id);
	}

	// -------------------------MEMORIAS--------------------
	// obtener
	@GetMapping("/Memorias")
	public List<MMemoria> obtenerMemorias() {
		return servicio_memoria.obtener();
	}

	// obtener
	@GetMapping("/Memoria/{id}")
	public MMemoria obtenerMemoria(@PathVariable("id") long id) {
		return servicio_memoria.obtener(id);
	}

	// Buscar
	@GetMapping("/MemoriaFind")
	public MMemoria buscarMemoria(@RequestBody @Validated EMemoria memoria) {
		return servicio_memoria.buscar(memoria);
	}

	// insertar
	@PostMapping("/Memoria")
	public boolean agregarMemoria(@RequestBody @Validated EMemoria memoria) {
		return servicio_memoria.crear(memoria);
	}

	// actualizar
	@PutMapping("/MemoriaUpdate")
	public boolean actualizarMemoria(@RequestBody @Validated EMemoria memoria) {
		return servicio_memoria.actualizar(memoria);

	}

	// borrar
	@DeleteMapping("/MemoriaDelete")
	public boolean borrarMemoria(@RequestParam("id") long id) {
		return servicio_memoria.borrar(id);
	}

	// -------------------------INNOVACIONESS--------------------
	// obtener
	@GetMapping("/Innovaciones")
	public List<MInnovacion> obtenerInnovaciones() {
		return servicio_innovacion.obtener();
	}

	// obtener
	@GetMapping("/Innovacion/{id}")
	public MInnovacion obtenerInnovacion(@PathVariable("id") long id) {
		return servicio_innovacion.obtener(id);
	}

	// Buscar
	@GetMapping("/InnovacionFind")
	public MInnovacion buscarInnovacion(@RequestBody @Validated EInnovacion innovacion) {
		return servicio_innovacion.buscar(innovacion);
	}

	// insertar
	@PostMapping("/Innovacion")
	public boolean agregarInnovacion(@RequestBody @Validated EInnovacion innovacion) {
		return servicio_innovacion.crear(innovacion);
	}

	// actualizar
	@PutMapping("/InnovacionUpdate")
	public boolean actualizarInnovacion(@RequestBody @Validated EInnovacion innovacion) {
		return servicio_innovacion.actualizar(innovacion);

	}

	// borrar
	@DeleteMapping("/InnovacionDelete")
	public boolean borrarInnovacion(@RequestParam("id") long id) {
		return servicio_innovacion.borrar(id);
	}

	// -------------------------DOCUMENTOS/RESEÑAS--------------------
	// obtener
	@GetMapping("/DocumentosReseñas")
	public List<MDocumentos_Reseñas> obtenerDocumentosReseñas() {
		return servicio_documento_reseña.obtener();
	}

	// obtener
	@GetMapping("/DocumentoResena/{id}")
	public MDocumentos_Reseñas obtenerDocumentoReseña(@PathVariable("id") long id) {
		return servicio_documento_reseña.obtener(id);
	}

	// Buscar
	@GetMapping("/DocumentoResenaFind")
	public MDocumentos_Reseñas buscarDocumentoReseña(@RequestBody @Validated EDocumentos_Reseñas documentos_Reseñas) {
		return servicio_documento_reseña.buscar(documentos_Reseñas);
	}

	// insertar
	@PostMapping("/DocumentoResena")
	public boolean agregarDocumentoReseña(@RequestBody @Validated EDocumentos_Reseñas doc) {
		return servicio_documento_reseña.crear(doc);

	}

	// actualizar
	@PutMapping("/DocumentoResenaUpdate")
	public boolean actualizarDocumentoReseña(@RequestBody @Validated EDocumentos_Reseñas doc) {
		return servicio_documento_reseña.actualizar(doc);

	}

	// borrar
	@DeleteMapping("/DocumentoResenaDelete")
	public boolean borrarDocumentoReseña(@RequestParam("id") long id) {
		return servicio_documento_reseña.borrar(id);
	}

	// -------------------------DESARROLLO TECNOLÓGICO--------------------
	// obtener
	@GetMapping("/Desarrollos")
	public List<MDesarrollo> obtenerDesarrollos() {
		return servicio_desarrollo.obtener();
	}

	// obtener
	@GetMapping("/Desarrollo/{id}")
	public MDesarrollo obtenerDesarrollo(@PathVariable("id") long id) {
		return servicio_desarrollo.obtener(id);
	}

	// Buscar
	@GetMapping("/DesarrolloFind")
	public MDesarrollo buscarDesarrollo(@RequestBody @Validated EDesarrollo desarrollo) {
		return servicio_desarrollo.buscar(desarrollo);
	}

	// insertar
	@PostMapping("/Desarrollo")
	public boolean agregarDesarrollo(@RequestBody @Validated EDesarrollo desarrollo) {
		return servicio_desarrollo.crear(desarrollo);

	}

	// actualizar
	@PutMapping("/DesarrolloUpdate")
	public boolean actualizarDesarrollo(@RequestBody @Validated EDesarrollo desarrollo) {
		return servicio_desarrollo.actualizar(desarrollo);

	}

	// borrar
	@DeleteMapping("/DesarrolloDelete")
	public boolean borrarDesarrollo(@RequestParam("id") long id) {
		return servicio_desarrollo.borrar(id);
	}

	// -------------------------CONFERENCIAS Y PRESENTACIONES--------------------
	// obtener
	@GetMapping("/ConferenciasPresentaciones")
	public List<MConferenciaPresentacion> obtenerConferenciasPresentaciones() {
		return servicio_conferencia_presentacion.obtener();
	}

	// obtener
	@GetMapping("/ConferenciaPresentacion/{id}")
	public MConferenciaPresentacion obtenerConferenciaPresentacion(@PathVariable("id") long id) {
		return servicio_conferencia_presentacion.obtener(id);
	}

	// Buscar
	@GetMapping("/ConferenciaPresentacionFind")
	public MConferenciaPresentacion buscarConferenciaPresentacion(
			@RequestBody @Validated EConferenciaPresentacion conferenciaPresentacion) {
		return servicio_conferencia_presentacion.buscar(conferenciaPresentacion);
	}

	// insertar
	@PostMapping("/ConferenciaPresentacion")
	public boolean agregarConferenciaPresentacion(
			@RequestBody @Validated EConferenciaPresentacion conferenciaPresentacion) {
		return servicio_conferencia_presentacion.crear(conferenciaPresentacion);

	}

	// actualizar
	@PutMapping("/ConferenciaPresentacionUpdate")
	public boolean actualizarConferenciaPresentacion(
			@RequestBody @Validated EConferenciaPresentacion conferenciaPresentacion) {
		return servicio_conferencia_presentacion.actualizar(conferenciaPresentacion);

	}

	// borrar
	@DeleteMapping("/ConferenciaPresentacionDelete")
	public boolean borrarConferenciaPresentacion(@RequestParam("id") long id) {
		return servicio_conferencia_presentacion.borrar(id);
	}

	// -------------------------TIPOS DE DESARROLLO TECNOLÓGICO-------------------
	// obtener
	@GetMapping("/TiposDesarrollo")
	public List<MTipoDesarrollo> obtenerTipos() {
		return servicio_tipo_desarrollo.obtener();
	}

	// obtener
	@GetMapping("/TipoDesarrollo/{id}")
	public MTipoDesarrollo obtenerTipoDesarrollo(@PathVariable("id") long id) {
		return servicio_tipo_desarrollo.obtener(id);
	}

	// insertar
	@PostMapping("/TipoDesarrollo")
	public boolean agregarTipoDesarrollo(@RequestBody @Validated ETipoDesarrollo desarrollo) {
		return servicio_tipo_desarrollo.crear(desarrollo);

	}

	// actualizar
	@PutMapping("/TipoDesarrolloUpdate")
	public boolean actualizarTipoDesarrollo(@RequestBody @Validated ETipoDesarrollo desarrollo) {
		return servicio_tipo_desarrollo.actualizar(desarrollo);

	}

	// borrar
	@DeleteMapping("/TipoDesarrolloDelete")
	public boolean borrarTipoDesarrollo(@RequestParam("id") long id) {
		return servicio_tipo_desarrollo.borrar(id);
	}

	// -------------------------ROL DE PARTICIPACION-------------------
	// obtener
	@GetMapping("/RolesParticipacion")
	public List<MRolParticipacion> obtenerRoles() {
		return servicio_rol_participacion.obtener();
	}

	// obtener
	@GetMapping("/RolParticipacion/{id}")
	public MRolParticipacion obtenerRolParticipacion(@PathVariable("id") long id) {
		return servicio_rol_participacion.obtener(id);
	}

	// insertar
	@PostMapping("/RolParticipacion")
	public boolean agregarTipoDesarrollo(@RequestBody @Validated ERolParticipacion rol) {
		return servicio_rol_participacion.crear(rol);

	}

	// actualizar
	@PutMapping("/RolParticipacionUpdate")
	public boolean actualizarRolParticipacion(@RequestBody @Validated ERolParticipacion rol) {
		return servicio_rol_participacion.actualizar(rol);

	}

	// borrar
	@DeleteMapping("/RolParticipacionDelete")
	public boolean borrarRolParticipacion(@RequestParam("id") long id) {
		return servicio_rol_participacion.borrar(id);
	}

	// -------------------------DOCUMENTOS DE RESPALDO-------------------
	// obtener
	@GetMapping("/DocumentosRespaldo")
	public List<MDocumentoRespaldo> obtenerDocumentosRespaldo() {
		return servicio_documento_respaldo.obtener();
	}

	// obtener
	@GetMapping("/DocumentoRespaldo/{id}")
	public MDocumentoRespaldo obtenerDocumentoRespaldo(@PathVariable("id") long id) {
		return servicio_documento_respaldo.obtener(id);
	}

	// insertar
	@PostMapping("/DocumentoRespaldo")
	public boolean agregarDocumentoRespaldo(@RequestBody @Validated EDocumentoRespaldo doc) {
		return servicio_documento_respaldo.crear(doc);

	}

	// actualizar
	@PutMapping("/DocumentoRespaldoUpdate")
	public boolean actualizarDocumentoRespaldo(@RequestBody @Validated EDocumentoRespaldo doc) {
		return servicio_documento_respaldo.actualizar(doc);

	}

	// borrar
	@DeleteMapping("/DocumentoRespaldoDelete")
	public boolean borrarDocumentoRespaldo(@RequestParam("id") long id) {
		return servicio_documento_respaldo.borrar(id);
	}

	// -------------------------Libros palabras puente--------------------
	// obtener
	@GetMapping("/LibrosPalabrasPuente")
	public List<MLibroPalabrasPuente> obtenerLibrosPalabrasPuente() {
		return servicio_libro_palabras_puente.obtener();
	}

	// obtener
	@GetMapping("/LibroPalabraPuente/{id}")
	public MLibroPalabrasPuente obtenerLibroPalabrapuente(@PathVariable("id") long id) {
		return servicio_libro_palabras_puente.obtener(id);
	}

	// insertar
	@PostMapping("/LibroPalabraPuente")
	public boolean agregarLibroPalabrapuente(@RequestBody @Validated ELibroPalabrasPuente puente) {
		return servicio_libro_palabras_puente.crear(puente);
	}

	// actualizar
	@PutMapping("/LibroPalabraclaveUpdate")
	public boolean actualizarLibro(@RequestBody @Validated ELibroPalabrasPuente puente) {
		return servicio_libro_palabras_puente.actualizar(puente);

	}

	// borrar
	@DeleteMapping("/LibroPalabraPuenteDelete")
	public boolean borrarLibroPalabraPuente(@RequestParam("id") long id) {
		return servicio_libro_palabras_puente.borrar(id);
	}

	// -------------------------Memorias palabras puente--------------------
	// obtener
	@GetMapping("/MemoriasPalabrasPuente")
	public List<MMemoriaPalabrasPuente> obtenerMemoriasPalabrasPuente() {
		return servicio_memoria_palabras_puente.obtener();
	}

	// obtener
	@GetMapping("/MemoriaPalabraPuente/{id}")
	public MMemoriaPalabrasPuente obtenerMemoriaPalabrapuente(@PathVariable("id") long id) {
		return servicio_memoria_palabras_puente.obtener(id);
	}

	// insertar
	@PostMapping("/MemoriaPalabraPuente")
	public boolean agregarMemoriaPalabrapuente(@RequestBody @Validated EMemoriaPalabrasPuente puente) {
		return servicio_memoria_palabras_puente.crear(puente);
	}

	// actualizar
	@PutMapping("/MemoriaPalabraclaveUpdate")
	public boolean actualizarMemoria(@RequestBody @Validated EMemoriaPalabrasPuente puente) {
		return servicio_memoria_palabras_puente.actualizar(puente);

	}

	// borrar
	@DeleteMapping("/MemoriaPalabraPuenteDelete")
	public boolean borrarMemoriaPalabraPuente(@RequestParam("id") long id) {
		return servicio_memoria_palabras_puente.borrar(id);
	}

	// -------------------------Reportes palabras puente--------------------
	// obtener
	@GetMapping("/ReportesPalabrasPuente")
	public List<MReportePalabrasPuente> obtenerReportesPalabrasPuente() {
		return servicio_reporte_palabras_puente.obtener();
	}

	// obtener
	@GetMapping("/ReportePalabraPuente/{id}")
	public MReportePalabrasPuente obtenerReportePalabrapuente(@PathVariable("id") long id) {
		return servicio_reporte_palabras_puente.obtener(id);
	}

	// insertar
	@PostMapping("/ReportePalabraPuente")
	public boolean agregarReportePalabrapuente(@RequestBody @Validated EReportePalabrasPuente puente) {
		return servicio_reporte_palabras_puente.crear(puente);
	}

	// actualizar
	@PutMapping("/ReportePalabraclaveUpdate")
	public boolean actualizarReporte(@RequestBody @Validated EReportePalabrasPuente puente) {
		return servicio_reporte_palabras_puente.actualizar(puente);

	}

	// borrar
	@DeleteMapping("/ReportePalabraPuenteDelete")
	public boolean borrarReportePalabraPuente(@RequestParam("id") long id) {
		return servicio_reporte_palabras_puente.borrar(id);
	}

	// -------------------------DocumentoReseña palabras puente--------------------
	// obtener
	@GetMapping("/DocumentosReseñasPalabrasPuente")
	public List<MDocumentoReseñaPalabrasPuente> obtenerDocumentoReseñasPalabrasPuente() {
		return servicio_documentos_reseña_palabras_puente.obtener();
	}

	// obtener
	@GetMapping("/DocumentoReseñaPalabraPuente/{id}")
	public MDocumentoReseñaPalabrasPuente obtenerDocumentoReseñaPalabrapuente(@PathVariable("id") long id) {
		return servicio_documentos_reseña_palabras_puente.obtener(id);
	}

	// insertar
	@PostMapping("/DocumentoReseñaPalabraPuente")
	public boolean agregarDocumentoReseñaPalabrapuente(@RequestBody @Validated EDocumentoReseñaPalabrasPuente puente) {
		return servicio_documentos_reseña_palabras_puente.crear(puente);
	}

	// actualizar
	@PutMapping("/DocumentoReseñaPalabraclaveUpdate")
	public boolean actualizarDocumentoReseña(@RequestBody @Validated EDocumentoReseñaPalabrasPuente puente) {
		return servicio_documentos_reseña_palabras_puente.actualizar(puente);

	}

	// borrar
	@DeleteMapping("/DocumentoReseñaPalabraPuenteDelete")
	public boolean borrarDocumentoReseñaPalabraPuente(@RequestParam("id") long id) {
		return servicio_documentos_reseña_palabras_puente.borrar(id);
	}

	// -------------------------Autores produccion académica--------------------
	// obtener
	@GetMapping("/Autores")
	public List<MAutor> obtenerAutores() {
		return servicio_autor.obtener();
	}

	// obtener
	@GetMapping("/Autor/{id}")
	public MAutor obtenerAutor(@PathVariable("id") long id) {
		return servicio_autor.obtener(id);
	}

	// Buscar
	@GetMapping("/AutorFind")
	public MAutor buscarOrden(@RequestBody @Validated EAutor autor) {
		return servicio_autor.buscar(autor);
	}

	// insertar
	@PostMapping("/Autor")
	public boolean agregarAutor(@RequestBody @Validated EAutor autor) {
		return servicio_autor.crear(autor);
	}

	// actualizar
	@PutMapping("/AutorUpdate")
	public boolean actualizarAutor(@RequestBody @Validated EAutor autor) {
		return servicio_autor.actualizar(autor);

	}

	// borrar
	@DeleteMapping("/AutorDelete")
	public boolean borrarAutor(@RequestParam("id") long id) {
		return servicio_autor.borrar(id);
	}

	// -------------------------Editores produccion académica--------------------
	// obtener
	@GetMapping("/Editores")
	public List<MEditor> obtenerEditores() {
		return servicio_editor.obtener();
	}

	// obtener
	@GetMapping("/Editor/{id}")
	public MEditor obtenerEditor(@PathVariable("id") long id) {
		return servicio_editor.obtener(id);
	}

	// Buscar
	@GetMapping("/EditorFind")
	public MEditor buscarEditor(@RequestBody @Validated EEditor editor) {
		return servicio_editor.buscar(editor);
	}

	// insertar
	@PostMapping("/Editor")
	public boolean agregarEditor(@RequestBody @Validated EEditor editor) {
		return servicio_editor.crear(editor);
	}

	// actualizar
	@PutMapping("/EditorUpdate")
	public boolean actualizarEditor(@RequestBody @Validated EEditor editor) {
		return servicio_editor.actualizar(editor);

	}

	// borrar
	@DeleteMapping("/EditorDelete")
	public boolean borrarEditor(@RequestParam("id") long id) {
		return servicio_editor.borrar(id);
	}

	// -------------------------Ordenes produccion académica--------------------
	// obtener
	@GetMapping("/Ordenes")
	public List<MOrden> obtenerOrdenes() {
		return servicio_orden.obtener();
	}

	// obtener
	@GetMapping("/Orden/{id}")
	public MOrden obtenerOrden(@PathVariable("id") long id) {
		return servicio_orden.obtener(id);
	}

	// Buscar
	@GetMapping("/OrdenFind")
	public MOrden buscarOrden(@RequestBody @Validated EOrden orden) {
		return servicio_orden.buscar(orden);
	}

	// insertar
	@PostMapping("/Orden")
	public boolean agregarOrden(@RequestBody @Validated EOrden orden) {
		return servicio_orden.crear(orden);
	}

	// actualizar
	@PutMapping("/OrdenUpdate")
	public boolean actualizarOrden(@RequestBody @Validated EOrden orden) {
		return servicio_orden.actualizar(orden);

	}

	// borrar
	@DeleteMapping("/OrdenDelete")
	public boolean borrarOrden(@RequestParam("id") long id) {
		return servicio_orden.borrar(id);
	}

	// -------------------------Produccion académica ARTICULO--------------------
	// obtener
	@GetMapping("/ProduccionesArticulos")
	public List<MProduccionAcademicaArticulo> obtenerProduccionArticulo() {
		return servicio_produccion_academica_articulo.obtener();
	}

	// obtener
	@GetMapping("/ProduccionArticulo/{id}")
	public MProduccionAcademicaArticulo obtenerProduccionArticulo(@PathVariable("id") long id) {
		return servicio_produccion_academica_articulo.obtener(id);
	}

	// insertar
	@PostMapping("/ProduccionArticulo")
	public boolean agregarProduccionArticulo(@RequestBody @Validated EProduccionAcademicaArticulo produccion) {
		return servicio_produccion_academica_articulo.crear(produccion);
	}

	// actualizar
	@PutMapping("/ProduccionArticuloUpdate")
	public boolean actualizarProduccionArticulo(@RequestBody @Validated EProduccionAcademicaArticulo produccion) {
		return servicio_produccion_academica_articulo.actualizar(produccion);

	}

	// borrar
	@DeleteMapping("/ProduccionArticuloDelete")
	public boolean borrarProduccionArticulo(@RequestParam("id") long id) {
		return servicio_produccion_academica_articulo.borrar(id);
	}

	// -------------------------Produccion académica LIBRO--------------------
	// obtener
	@GetMapping("/ProduccionesLibros")
	public List<MProduccionAcademicaLibro> obtenerProduccionLibro() {
		return servicio_produccion_academica_libro.obtener();
	}

	// obtener
	@GetMapping("/ProduccionLibro/{id}")
	public MProduccionAcademicaLibro obtenerProduccionLibro(@PathVariable("id") long id) {
		return servicio_produccion_academica_libro.obtener(id);
	}

	// insertar
	@PostMapping("/ProduccionLibro")
	public boolean agregarProduccionLibro(@RequestBody @Validated EProduccionAcademicaLibro produccion) {
		return servicio_produccion_academica_libro.crear(produccion);
	}

	// actualizar
	@PutMapping("/ProduccionLibroUpdate")
	public boolean actualizarProduccionLibro(@RequestBody @Validated EProduccionAcademicaLibro produccion) {
		return servicio_produccion_academica_libro.actualizar(produccion);

	}

	// borrar
	@DeleteMapping("/ProduccionLibroDelete")
	public boolean borrarProduccionLibro(@RequestParam("id") long id) {
		return servicio_produccion_academica_libro.borrar(id);
	}

	// -------------------------Produccion académica INNOVACION--------------------
	// obtener
	@GetMapping("/ProduccionesInnovaciones")
	public List<MProduccionAcademicaInnovacion> obtenerProduccionInnovaciones() {
		return servicio_produccion_academica_innovacion.obtener();
	}

	// obtener
	@GetMapping("/ProduccionInnovacion/{id}")
	public MProduccionAcademicaInnovacion obtenerProduccionInnovacion(@PathVariable("id") long id) {
		return servicio_produccion_academica_innovacion.obtener(id);
	}

	// insertar
	@PostMapping("/ProduccionInnovacion")
	public boolean agregarProduccionInnovacion(@RequestBody @Validated EProduccionAcademicaInnovacion produccion) {
		return servicio_produccion_academica_innovacion.crear(produccion);
	}

	// actualizar
	@PutMapping("/ProduccionInnovacionUpdate")
	public boolean actualizarProduccionInnovacion(@RequestBody @Validated EProduccionAcademicaInnovacion produccion) {
		return servicio_produccion_academica_innovacion.actualizar(produccion);

	}

	// borrar
	@DeleteMapping("/ProduccionInnovacionDelete")
	public boolean borrarProduccionInnovacion(@RequestParam("id") long id) {
		return servicio_produccion_academica_innovacion.borrar(id);
	}

	// -------------------------Produccion académica DESARROLLO
	// TECNOLOGICO--------------------
	// obtener
	@GetMapping("/ProduccionesDesarrollos")
	public List<MProduccionAcademicaDesarrollo> obtenerProduccionDesarrollos() {
		return servicio_produccion_academica_desarrollo.obtener();
	}

	// obtener
	@GetMapping("/ProduccionDesarrollo/{id}")
	public MProduccionAcademicaDesarrollo obtenerProduccionDesarrollo(@PathVariable("id") long id) {
		return servicio_produccion_academica_desarrollo.obtener(id);
	}

	// insertar
	@PostMapping("/ProduccionDesarrollo")
	public boolean agregarProduccionDesarrollo(@RequestBody @Validated EProduccionAcademicaDesarrollo produccion) {
		return servicio_produccion_academica_desarrollo.crear(produccion);
	}

	// actualizar
	@PutMapping("/ProduccionDesarrolloUpdate")
	public boolean actualizarProduccionDesarrollo(@RequestBody @Validated EProduccionAcademicaDesarrollo produccion) {
		return servicio_produccion_academica_desarrollo.actualizar(produccion);

	}

	// borrar
	@DeleteMapping("/ProduccionDesarrolloDelete")
	public boolean borrarProduccionDesarrollo(@RequestParam("id") long id) {
		return servicio_produccion_academica_desarrollo.borrar(id);
	}

	// -------------------------Produccion académica REPORTE
	// obtener
	@GetMapping("/ProduccionesReportes")
	public List<MProduccionAcademicaReporte> obtenerProduccionReportes() {
		return servicio_produccion_academica_reporte.obtener();
	}

	// obtener
	@GetMapping("/ProduccionReporte/{id}")
	public MProduccionAcademicaReporte obtenerProduccionReporte(@PathVariable("id") long id) {
		return servicio_produccion_academica_reporte.obtener(id);
	}

	// insertar
	@PostMapping("/ProduccionReporte")
	public boolean agregarProduccionReporte(@RequestBody @Validated EProduccionAcademicaReporte produccion) {
		return servicio_produccion_academica_reporte.crear(produccion);
	}

	// actualizar
	@PutMapping("/ProduccionReporteUpdate")
	public boolean actualizarProduccionReporte(@RequestBody @Validated EProduccionAcademicaReporte produccion) {
		return servicio_produccion_academica_reporte.actualizar(produccion);

	}

	// borrar
	@DeleteMapping("/ProduccionReporteDelete")
	public boolean borrarProduccionReporte(@RequestParam("id") long id) {
		return servicio_produccion_academica_reporte.borrar(id);
	}

	// -------------------------Produccion académica
	// DOCUMENTOS/RESEÑAS--------------------
	// obtener
	@GetMapping("/ProduccionesDocumentosReseñas")
	public List<MProduccionAcademicaDocumentosReseña> obtenerProduccionDocumentosReseñas() {
		return servicio_produccion_academica_documento_reseña.obtener();
	}

	// obtener
	@GetMapping("/ProduccionDocumentoReseña/{id}")
	public MProduccionAcademicaDocumentosReseña obtenerProduccionDocumentoReseña(@PathVariable("id") long id) {
		return servicio_produccion_academica_documento_reseña.obtener(id);
	}

	// insertar
	@PostMapping("/ProduccionDocumentoReseña")
	public boolean agregarProduccionDocumentoReseña(
			@RequestBody @Validated EProduccionAcademicaDocumentosReseña produccion) {
		return servicio_produccion_academica_documento_reseña.crear(produccion);
	}

	// actualizar
	@PutMapping("/ProduccionDocumentoReseñaUpdate")
	public boolean actualizarProduccionDocumentoReseña(
			@RequestBody @Validated EProduccionAcademicaDocumentosReseña produccion) {
		return servicio_produccion_academica_documento_reseña.actualizar(produccion);

	}

	// borrar
	@DeleteMapping("/ProduccionDocumentoReseñaDelete")
	public boolean borrarProduccionDocumentoReseña(@RequestParam("id") long id) {
		return servicio_produccion_academica_documento_reseña.borrar(id);
	}

	// -------------------------Produccion académica MEMORIAS--------------------
	// obtener
	@GetMapping("/ProduccionesMemorias")
	public List<MProduccionAcademicaMemoria> obtenerProduccionMemorias() {
		return servicio_produccion_academica_memoria.obtener();
	}

	// obtener
	@GetMapping("/ProduccionMemoria/{id}")
	public MProduccionAcademicaMemoria obtenerProduccionMemoria(@PathVariable("id") long id) {
		return servicio_produccion_academica_memoria.obtener(id);
	}

	// insertar
	@PostMapping("/ProduccionMemoria")
	public boolean agregarProduccionMemoria(@RequestBody @Validated EProduccionAcademicaMemoria produccion) {
		return servicio_produccion_academica_memoria.crear(produccion);
	}

	// actualizar
	@PutMapping("/ProduccionMemoriaUpdate")
	public boolean actualizarProduccionMemoria(@RequestBody @Validated EProduccionAcademicaMemoria produccion) {
		return servicio_produccion_academica_memoria.actualizar(produccion);

	}

	// borrar
	@DeleteMapping("/ProduccionMemoriaDelete")
	public boolean borrarProduccionMemoria(@RequestParam("id") long id) {
		return servicio_produccion_academica_memoria.borrar(id);
	}

	// -------------------------Produccion académica CONFERENCIAS Y
	// PRESENTACIONES--------------------
	// obtener
	@GetMapping("/ProduccionesConferenciasPresentaciones")
	public List<MProduccionAcademicaConferenciaPresentacion> obtenerProduccionConferenciasPresentaciones() {
		return servicio_produccion_academica_conferencia_presentacion.obtener();
	}

	// obtener
	@GetMapping("/ProduccionConferenciaPresentacion/{id}")
	public MProduccionAcademicaConferenciaPresentacion obtenerProduccionConferenciaPresentacion(
			@PathVariable("id") long id) {
		return servicio_produccion_academica_conferencia_presentacion.obtener(id);
	}

	// insertar
	@PostMapping("/ProduccionConferenciaPresentacion")
	public boolean agregarProduccionConferenciaPresentacion(
			@RequestBody @Validated EProduccionAcademicaConferenciaPresentacion conferenciaPresentacion) {
		return servicio_produccion_academica_conferencia_presentacion.crear(conferenciaPresentacion);
	}

	// actualizar
	@PutMapping("/ProduccionConferenciaPresentacionUpdate")
	public boolean actualizarProduccionConferenciaPresentacion(
			@RequestBody @Validated EProduccionAcademicaConferenciaPresentacion conferenciaPresentacion) {
		return servicio_produccion_academica_conferencia_presentacion.actualizar(conferenciaPresentacion);
	}

	// borrar
	@DeleteMapping("/ProduccionConferenciaPresentacionDelete")
	public boolean borrarProduccionConferenciaPresentacion(@RequestParam("id") long id) {
		return servicio_produccion_academica_conferencia_presentacion.borrar(id);
	}

	
	//------------------------READER------------------------------------------
	@PostMapping("/Reader")
	public void leerCV(@RequestParam(name = "ruta") String ruta)
	{
		File archivoFile = new File(ruta);
		reader.leer(archivoFile);
	}
}
