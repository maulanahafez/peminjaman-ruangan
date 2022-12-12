package models;

import play.db.jpa.Model;
import javax.persistence.Entity;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Riwayat extends Model {
    public LocalDate tanggal;
    public String namaPeminjam;
    public String nomorPeminjam;
    public LocalDate tanggalPinjam;
    public String ruang;
    public LocalTime waktuAwal;
    public LocalTime waktuAkhir;
}