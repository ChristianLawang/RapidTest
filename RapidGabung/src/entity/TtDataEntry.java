package entity;

import java.util.Date;

/**
 * TtDataEntry generated by hbm2java
 */
public class TtDataEntry implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String awbDataEntry;
	private String asalPaket;
	private String pengirim;
	private String penerima;
	private String tujuan;
	private String telpPenerima;
	private String reseller;
	private String keterangan;
	private String bclose;
	private String pbclose;
	private Integer harga;
	private Integer biaya;
	private String kodePerwakilan;
	private Integer jneFlag;
	private Integer asuransi;
	private Integer totalDiskon;
	private Integer totalBiaya;
	private String user;
	private Integer flagEntry;
	private Date tglCreate;
	private Date tglUpdate;
	private Integer flag;
	
	//Nambah Sendiri
	private Integer jumlahPelanggan;

	public TtDataEntry() {
	}

	public TtDataEntry(String awbDataEntry) {
		this.awbDataEntry = awbDataEntry;
	}

	public Integer getJumlahPelanggan() {
		return jumlahPelanggan;
	}

	public void setJumlahPelanggan(Integer jumlahPelanggan) {
		this.jumlahPelanggan = jumlahPelanggan;
	}
	
	public TtDataEntry(String awbDataEntry, String asalPaket, String pengirim, String penerima, String tujuan,
			String telpPenerima, String reseller, String keterangan, String bclose, String pbclose, Integer harga,
			Integer biaya, String kodePerwakilan, Integer jneFlag, Integer asuransi, Integer totalDiskon,
			Integer totalBiaya, String user, Integer flagEntry, Date tglCreate, Date tglUpdate, Integer flag) {
		this.awbDataEntry = awbDataEntry;
		this.asalPaket = asalPaket;
		this.pengirim = pengirim;
		this.penerima = penerima;
		this.tujuan = tujuan;
		this.telpPenerima = telpPenerima;
		this.reseller = reseller;
		this.keterangan = keterangan;
		this.bclose = bclose;
		this.pbclose = pbclose;
		this.harga = harga;
		this.biaya = biaya;
		this.kodePerwakilan = kodePerwakilan;
		this.jneFlag = jneFlag;
		this.asuransi = asuransi;
		this.totalDiskon = totalDiskon;
		this.totalBiaya = totalBiaya;
		this.user = user;
		this.flagEntry = flagEntry;
		this.tglCreate = tglCreate;
		this.tglUpdate = tglUpdate;
		this.flag = flag;
	}

	public String getAwbDataEntry() {
		return this.awbDataEntry;
	}

	public void setAwbDataEntry(String awbDataEntry) {
		this.awbDataEntry = awbDataEntry;
	}

	public String getAsalPaket() {
		return this.asalPaket;
	}

	public void setAsalPaket(String asalPaket) {
		this.asalPaket = asalPaket;
	}

	public String getPengirim() {
		return this.pengirim;
	}

	public void setPengirim(String pengirim) {
		this.pengirim = pengirim;
	}

	public String getPenerima() {
		return this.penerima;
	}

	public void setPenerima(String penerima) {
		this.penerima = penerima;
	}

	public String getTujuan() {
		return this.tujuan;
	}

	public void setTujuan(String tujuan) {
		this.tujuan = tujuan;
	}

	public String getTelpPenerima() {
		return this.telpPenerima;
	}

	public void setTelpPenerima(String telpPenerima) {
		this.telpPenerima = telpPenerima;
	}

	public String getReseller() {
		return this.reseller;
	}

	public void setReseller(String reseller) {
		this.reseller = reseller;
	}

	public String getKeterangan() {
		return this.keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}

	public String getBclose() {
		return this.bclose;
	}

	public void setBclose(String bclose) {
		this.bclose = bclose;
	}

	public String getPbclose() {
		return this.pbclose;
	}

	public void setPbclose(String pbclose) {
		this.pbclose = pbclose;
	}

	public Integer getHarga() {
		return this.harga;
	}

	public void setHarga(Integer harga) {
		this.harga = harga;
	}

	public Integer getBiaya() {
		return this.biaya;
	}

	public void setBiaya(Integer biaya) {
		this.biaya = biaya;
	}

	public String getKodePerwakilan() {
		return this.kodePerwakilan;
	}

	public void setKodePerwakilan(String kodePerwakilan) {
		this.kodePerwakilan = kodePerwakilan;
	}

	public Integer getJneFlag() {
		return this.jneFlag;
	}

	public void setJneFlag(Integer jneFlag) {
		this.jneFlag = jneFlag;
	}

	public Integer getAsuransi() {
		return this.asuransi;
	}

	public void setAsuransi(Integer asuransi) {
		this.asuransi = asuransi;
	}

	public Integer getTotalDiskon() {
		return this.totalDiskon;
	}

	public void setTotalDiskon(Integer totalDiskon) {
		this.totalDiskon = totalDiskon;
	}

	public Integer getTotalBiaya() {
		return this.totalBiaya;
	}

	public void setTotalBiaya(Integer totalBiaya) {
		this.totalBiaya = totalBiaya;
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Integer getFlagEntry() {
		return this.flagEntry;
	}

	public void setFlagEntry(Integer flagEntry) {
		this.flagEntry = flagEntry;
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

}