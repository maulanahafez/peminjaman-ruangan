package models;

import play.db.jpa.Model;
import javax.persistence.Entity;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Peminjaman extends Model {
    public int idPeminjaman;
    public LocalDate tanggal;
    public String namaPeminjam;
    public String ruang;
    public LocalDate tanggalPinjam;
    public LocalTime waktuAwal;
    public LocalTime waktuAkhir;
    public String nomorPeminjam;
}
