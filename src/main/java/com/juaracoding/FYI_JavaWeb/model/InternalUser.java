package com.juaracoding.FYI_JavaWeb.model;/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Moh. Ikhsan a.k.a. Fitriyani
Java Developer
Created on 2/27/2023 10:26 PM
@Last Modified 2/27/2023 10:26 PM
Version 1.0
*/

//import org.hibernate.validator.constraints.Length;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.NotNull;
//import java.time.LocalDate;
//import java.util.Date;
//
//@Entity
//@Table(name = "MstInternalUser")
//public class InternalUser {
//
//    @Id
//    @Column(name = "IDInternalUser")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long idInternalUser;
//
//    @Column(name = "UserName",nullable = false)
//    private String username;
//
//    @NotNull
//    @Column(name = "Password",nullable = false,length = 128)
//    private String password;
//
//    @Column(name = "NamaDepan",nullable = false,length = 25)
//    private String namaDepan;
//
//    @Column(name = "NamaBelakang", length = 25)
//    private String namaBelakang;
//    @Column(name = "TanggalLahir",length = 25)
//    private LocalDate tanggalLahir;
//
//    @Column(name = "StatusNikah",length = 25)
//    private String statusKawin;
//
//    @Column(name = "TanggalLahir",length = 25)
//    private String jenisKelamin;
//
//    private String cabang;
//
//    private Integer kodePos;
//
//    private String email;
//
//    private String alamat;
//
//    private String noHp;
//
//    @Transient
//    private Integer umur;
//
//    @Column(name ="CreatedDate" , nullable = false)
//    private Date createdDate = new Date();
//
//    @Column(name = "CreatedBy", nullable = false)
//    private Integer createdBy;
//
//    @Column(name = "ModifiedDate")
//    private Date modifiedDate;
//    @Column(name = "ModifiedBy")
//    private Integer modifiedBy;
//
//    @Column(name = "IsDelete", nullable = false)
//    private Byte isDelete = 1;
//    /*
//        end audit trails
//     */
//
//    public Long getIdInternalUser() {
//        return idInternalUser;
//    }
//
//    public void setIdInternalUser(Long idInternalUser) {
//        this.idInternalUser = idInternalUser;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getNamaDepan() {
//        return namaDepan;
//    }
//
//    public void setNamaDepan(String namaDepan) {
//        this.namaDepan = namaDepan;
//    }
//
//    public String getNamaBelakang() {
//        return namaBelakang;
//    }
//
//    public void setNamaBelakang(String namaBelakang) {
//        this.namaBelakang = namaBelakang;
//    }
//
//    public LocalDate getTanggalLahir() {
//        return tanggalLahir;
//    }
//
//    public void setTanggalLahir(LocalDate tanggalLahir) {
//        this.tanggalLahir = tanggalLahir;
//    }
//
//    public String getStatusKawin() {
//        return statusKawin;
//    }
//
//    public void setStatusKawin(String statusKawin) {
//        this.statusKawin = statusKawin;
//    }
//
//    public String getJenisKelamin() {
//        return jenisKelamin;
//    }
//
//    public void setJenisKelamin(String jenisKelamin) {
//        this.jenisKelamin = jenisKelamin;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getAlamat() {
//        return alamat;
//    }
//
//    public void setAlamat(String alamat) {
//        this.alamat = alamat;
//    }
//
//    public String getNoHp() {
//        return noHp;
//    }
//
//    public void setNoHp(String noHp) {
//        this.noHp = noHp;
//    }
//
//    public Integer getUmur() {
//        return umur;
//    }
//
//    public void setUmur(Integer umur) {
//        this.umur = umur;
//    }
//
//    public Date getCreatedDate() {
//        return createdDate;
//    }
//
//    public void setCreatedDate(Date createdDate) {
//        this.createdDate = createdDate;
//    }
//
//    public Integer getCreatedBy() {
//        return createdBy;
//    }
//
//    public void setCreatedBy(Integer createdBy) {
//        this.createdBy = createdBy;
//    }
//
//    public Date getModifiedDate() {
//        return modifiedDate;
//    }
//
//    public void setModifiedDate(Date modifiedDate) {
//        this.modifiedDate = modifiedDate;
//    }
//
//    public Integer getModifiedBy() {
//        return modifiedBy;
//    }
//
//    public void setModifiedBy(Integer modifiedBy) {
//        this.modifiedBy = modifiedBy;
//    }
//
//    public Byte getIsDelete() {
//        return isDelete;
//    }
//
//    public void setIsDelete(Byte isDelete) {
//        this.isDelete = isDelete;
//    }
//}