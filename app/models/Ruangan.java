package models;
import play.db.jpa.Model;
import javax.persistence.Entity;

@Entity
public class Ruangan extends Model{
    public int idRuangan;
    public String namaRuangan;
    public String gedung;
    public String lantai;
    public String kapasitas;
}
