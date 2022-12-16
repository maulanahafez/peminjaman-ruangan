package controllers;

import play.*;
import play.db.jpa.GenericModel;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void ruangan() {
        List ruanganList = Ruangan.findAll();
        render(ruanganList);
    }

    public static void ruanganinsert(Ruangan newRuangan) {
        newRuangan.save();
        ruangan();
    }

    public static void ruanganupdate(Long id) {
        Ruangan ruanganUpdate = Ruangan.find("id = ?1", id).first();
        render(ruanganUpdate);
    }

    public static void ruangandelete(Long id) {
        Ruangan ruanganDelete = Ruangan.find("id = ?1", id).first();
        ruanganDelete.delete();
        ruangan();
    }

    public static void peminjaman() {
        List peminjamanList = Peminjaman.findAll();
        render(peminjamanList);
    }

    public static void peminjamaninsert(Peminjaman newPeminjaman) {
        newPeminjaman.save();
        peminjaman();
    }

    public static void peminjamanupdate(Long id) {
        Peminjaman peminjamanUpdate = Peminjaman.find("id = ?1", id).first();
        render(peminjamanUpdate);
    }

    public static void peminjamandelete(Long id) {
        Peminjaman peminjamanDelete = Peminjaman.find("id = ?1", id).first();
        peminjamanDelete.delete();
        peminjaman();
    }

    public static void peminjamanmove(Long id) {
        Peminjaman peminjamanMove = Peminjaman.find("id = ?1", id).first();
        render(peminjamanMove);
    }

    public static void riwayat() {
        List riwayatList = Riwayat.findAll();
        render(riwayatList);
    }

    public static void riwayatinsert(Riwayat newRiwayat){
        newRiwayat.save();
        riwayat();
    }
}