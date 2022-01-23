package com.caribbean.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column; 
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name = "tcus_clientes")	
public class clientesM {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nmid;
    
    @Column(name="cus_nmcliente")
    private Integer cus_nmcliente;
    
    @Column(name="cus_dsnombres")
	private String cus_dsnombres;
    
    @Column(name="cus_dsapellidos")
	private String cus_dsapellidos;
    
    @Column(name="cus_dsdireccion")
	private String cus_dsdireccion;
    
    @Column(name="cus_dscorreo")
	private String cus_dscorreo;
    
    @Column(name="cus_cdtelefono")
	private String cus_cdtelefono;
    
    @Column(name="cus_cdtelefonoalter")
	private String cus_cdtelefonoalter;
    
    @Column(name="cus_cdcelular")
	private String cus_cdcelular;
    
    @Column(name="cus_nmcargo")
	private Integer cus_nmcargo;
    
    @Column(name="cus_dscargo")
	private String cus_dscargo;
    
    @Column(name="cus_nmciudad")
	private Integer cus_nmciudad;
    
    @Column(name="cus_dsciudad")
	private String cus_dsciudad;
    
    @Column(name="cus_fenacimiento")
	private Date cus_fenacimiento;
    
    @Column(name="cus_genero")
	private String cus_genero;
    
    @Column(name="cus_nmcomunidad")
	private Integer cus_nmcomunidad;
    
    @Column(name="cus_dscomunidad")
	private String cus_dscomunidad;
    
    @Column(name="cus_dsempresalabora")
	private String cus_dsempresalabora;
    
    @Column(name="cus_nmdivision")
	private Integer cus_nmdivision;
    
    @Column(name="cus_dsdivision")
	private String cus_dsdivision;
    
    @Column(name="cus_nmpais")
	private Integer cus_nmpais;
    
    @Column(name="cus_dspais")
	private String cus_dspais;
    
    @Column(name="cus_hobbies")
	private String cus_hobbies;
    
    @Column(name="cus_febaja")
	private Date cus_febaja;
    
    @Column(name="cus_feregistro")
	private Date cus_feregistro;
	/**
	 * @return the nmid
	 */
	public Long getNmid() {
		return nmid;
	}
	/**
	 * @param nmid the nmid to set
	 */
	public void setNmid(Long nmid) {
		this.nmid = nmid;
	}
	/**
	 * @return the cus_nmcliente
	 */
	public Integer getCus_nmcliente() {
		return cus_nmcliente;
	}
	/**
	 * @param cus_nmcliente the cus_nmcliente to set
	 */
	public void setCus_nmcliente(Integer cus_nmcliente) {
		this.cus_nmcliente = cus_nmcliente;
	}
	/**
	 * @return the cus_dsnombres
	 */
	public String getCus_dsnombres() {
		return cus_dsnombres;
	}
	/**
	 * @param cus_dsnombres the cus_dsnombres to set
	 */
	public void setCus_dsnombres(String cus_dsnombres) {
		this.cus_dsnombres = cus_dsnombres;
	}
	/**
	 * @return the cus_dsapellidos
	 */
	public String getCus_dsapellidos() {
		return cus_dsapellidos;
	}
	/**
	 * @param cus_dsapellidos the cus_dsapellidos to set
	 */
	public void setCus_dsapellidos(String cus_dsapellidos) {
		this.cus_dsapellidos = cus_dsapellidos;
	}
	/**
	 * @return the cus_dsdireccion
	 */
	public String getCus_dsdireccion() {
		return cus_dsdireccion;
	}
	/**
	 * @param cus_dsdireccion the cus_dsdireccion to set
	 */
	public void setCus_dsdireccion(String cus_dsdireccion) {
		this.cus_dsdireccion = cus_dsdireccion;
	}
	/**
	 * @return the cus_dscorreo
	 */
	public String getCus_dscorreo() {
		return cus_dscorreo;
	}
	/**
	 * @param cus_dscorreo the cus_dscorreo to set
	 */
	public void setCus_dscorreo(String cus_dscorreo) {
		this.cus_dscorreo = cus_dscorreo;
	}
	/**
	 * @return the cus_cdtelefono
	 */
	public String getCus_cdtelefono() {
		return cus_cdtelefono;
	}
	/**
	 * @param cus_cdtelefono the cus_cdtelefono to set
	 */
	public void setCus_cdtelefono(String cus_cdtelefono) {
		this.cus_cdtelefono = cus_cdtelefono;
	}
	/**
	 * @return the cus_cdtelefonoalter
	 */
	public String getCus_cdtelefonoalter() {
		return cus_cdtelefonoalter;
	}
	/**
	 * @param cus_cdtelefonoalter the cus_cdtelefonoalter to set
	 */
	public void setCus_cdtelefonoalter(String cus_cdtelefonoalter) {
		this.cus_cdtelefonoalter = cus_cdtelefonoalter;
	}
	/**
	 * @return the cus_cdcelular
	 */
	public String getCus_cdcelular() {
		return cus_cdcelular;
	}
	/**
	 * @param cus_cdcelular the cus_cdcelular to set
	 */
	public void setCus_cdcelular(String cus_cdcelular) {
		this.cus_cdcelular = cus_cdcelular;
	}
	/**
	 * @return the cus_nmcargo
	 */
	public Integer getCus_nmcargo() {
		return cus_nmcargo;
	}
	/**
	 * @param cus_nmcargo the cus_nmcargo to set
	 */
	public void setCus_nmcargo(Integer cus_nmcargo) {
		this.cus_nmcargo = cus_nmcargo;
	}
	/**
	 * @return the cus_dscargo
	 */
	public String getCus_dscargo() {
		return cus_dscargo;
	}
	/**
	 * @param cus_dscargo the cus_dscargo to set
	 */
	public void setCus_dscargo(String cus_dscargo) {
		this.cus_dscargo = cus_dscargo;
	}
	/**
	 * @return the cus_nmciudad
	 */
	public Integer getCus_nmciudad() {
		return cus_nmciudad;
	}
	/**
	 * @param cus_nmciudad the cus_nmciudad to set
	 */
	public void setCus_nmciudad(Integer cus_nmciudad) {
		this.cus_nmciudad = cus_nmciudad;
	}
	/**
	 * @return the cus_dsciudad
	 */
	public String getCus_dsciudad() {
		return cus_dsciudad;
	}
	/**
	 * @param cus_dsciudad the cus_dsciudad to set
	 */
	public void setCus_dsciudad(String cus_dsciudad) {
		this.cus_dsciudad = cus_dsciudad;
	}
	/**
	 * @return the cus_fenacimiento
	 */
	public Date getCus_fenacimiento() {
		return cus_fenacimiento;
	}
	/**
	 * @param cus_fenacimiento the cus_fenacimiento to set
	 */
	public void setCus_fenacimiento(Date cus_fenacimiento) {
		this.cus_fenacimiento = cus_fenacimiento;
	}
	/**
	 * @return the cus_genero
	 */
	public String getCus_genero() {
		return cus_genero;
	}
	/**
	 * @param cus_genero the cus_genero to set
	 */
	public void setCus_genero(String cus_genero) {
		this.cus_genero = cus_genero;
	}
	/**
	 * @return the cus_nmcomunidad
	 */
	public Integer getCus_nmcomunidad() {
		return cus_nmcomunidad;
	}
	/**
	 * @param cus_nmcomunidad the cus_nmcomunidad to set
	 */
	public void setCus_nmcomunidad(Integer cus_nmcomunidad) {
		this.cus_nmcomunidad = cus_nmcomunidad;
	}
	/**
	 * @return the cus_dscomunidad
	 */
	public String getCus_dscomunidad() {
		return cus_dscomunidad;
	}
	/**
	 * @param cus_dscomunidad the cus_dscomunidad to set
	 */
	public void setCus_dscomunidad(String cus_dscomunidad) {
		this.cus_dscomunidad = cus_dscomunidad;
	}
	/**
	 * @return the cus_dsempresalabora
	 */
	public String getCus_dsempresalabora() {
		return cus_dsempresalabora;
	}
	/**
	 * @param cus_dsempresalabora the cus_dsempresalabora to set
	 */
	public void setCus_dsempresalabora(String cus_dsempresalabora) {
		this.cus_dsempresalabora = cus_dsempresalabora;
	}
	/**
	 * @return the cus_nmdivision
	 */
	public Integer getCus_nmdivision() {
		return cus_nmdivision;
	}
	/**
	 * @param cus_nmdivision the cus_nmdivision to set
	 */
	public void setCus_nmdivision(Integer cus_nmdivision) {
		this.cus_nmdivision = cus_nmdivision;
	}
	/**
	 * @return the cus_dsdivision
	 */
	public String getCus_dsdivision() {
		return cus_dsdivision;
	}
	/**
	 * @param cus_dsdivision the cus_dsdivision to set
	 */
	public void setCus_dsdivision(String cus_dsdivision) {
		this.cus_dsdivision = cus_dsdivision;
	}
	/**
	 * @return the cus_nmpais
	 */
	public Integer getCus_nmpais() {
		return cus_nmpais;
	}
	/**
	 * @param cus_nmpais the cus_nmpais to set
	 */
	public void setCus_nmpais(Integer cus_nmpais) {
		this.cus_nmpais = cus_nmpais;
	}
	/**
	 * @return the cus_dspais
	 */
	public String getCus_dspais() {
		return cus_dspais;
	}
	/**
	 * @param cus_dspais the cus_dspais to set
	 */
	public void setCus_dspais(String cus_dspais) {
		this.cus_dspais = cus_dspais;
	}
	/**
	 * @return the cus_hobbies
	 */
	public String getCus_hobbies() {
		return cus_hobbies;
	}
	/**
	 * @param cus_hobbies the cus_hobbies to set
	 */
	public void setCus_hobbies(String cus_hobbies) {
		this.cus_hobbies = cus_hobbies;
	}
	/**
	 * @return the cus_febaja
	 */
	public Date getCus_febaja() {
		return cus_febaja;
	}
	/**
	 * @param cus_febaja the cus_febaja to set
	 */
	public void setCus_febaja(Date cus_febaja) {
		this.cus_febaja = cus_febaja;
	}
	/**
	 * @return the cus_feregistro
	 */
	public Date getCus_feregistro() {
		return cus_feregistro;
	}
	/**
	 * @param cus_feregistro the cus_feregistro to set
	 */
	public void setCus_feregistro(Date cus_feregistro) {
		this.cus_feregistro = cus_feregistro;
	}
}
