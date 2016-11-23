package entity;

// default package
// Generated Jun 22, 2016 9:21:28 PM by Hibernate Tools 5.1.0.Alpha1

import java.util.Date;

/**
 * TrUser generated by hbm2java
 */
public class TrUser implements java.io.Serializable {

	private String idUser;
	private String namaUser;
	private String email;
	private String password;
	private String rememberToken;
	private Integer status;
	private String kodeCabang;
	private Date login;
	private Date tglCreate;
	private Date tglUpdate;
	private Integer flag;
	private Integer idRole;

	public TrUser() {
	}

	public TrUser(String idUser) {
		this.idUser = idUser;
	}

	public TrUser(String idUser, String namaUser, String email, String password, String rememberToken, Integer status,
			String kodeCabang, Date login, Date tglCreate, Date tglUpdate, Integer flag, Integer idRole) {
		this.idUser = idUser;
		this.namaUser = namaUser;
		this.email = email;
		this.password = password;
		this.rememberToken = rememberToken;
		this.status = status;
		this.kodeCabang = kodeCabang;
		this.login = login;
		this.tglCreate = tglCreate;
		this.tglUpdate = tglUpdate;
		this.flag = flag;
		this.idRole=idRole;
	}

	public String getIdUser() {
		return this.idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	public String getNamaUser() {
		return this.namaUser;
	}

	public void setNamaUser(String namaUser) {
		this.namaUser = namaUser;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRememberToken() {
		return this.rememberToken;
	}

	public void setRememberToken(String rememberToken) {
		this.rememberToken = rememberToken;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getKodeCabang() {
		return this.kodeCabang;
	}

	public void setKodeCabang(String kodeCabang) {
		this.kodeCabang = kodeCabang;
	}

	public Date getLogin() {
		return this.login;
	}

	public void setLogin(Date login) {
		this.login = login;
	}

	public Date getTglCreate() {
		return this.tglCreate;
	}

	public void setTglCreate(Date tglCreate) {
		this.tglCreate = tglCreate;
	}

	public Date getTglUpdate() {
		return this.tglUpdate;
	}

	public void setTglUpdate(Date tglUpdate) {
		this.tglUpdate = tglUpdate;
	}

	public Integer getFlag() {
		return this.flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public Integer getIdRole() {
		return idRole;
	}

	public void setIdRole(Integer idRole) {
		this.idRole = idRole;
	}
	
	

}