package com.example.modul6mobile_030;

public class Konfigurasi {

    public static final String URL_ADD="http://192.168.1.5/db_android/insert.php";
    public static final String URL_GET_ALL = "http://192.168.1.5/db_android/read.php";
    public static final String URL_GET_EMP = "http://192.168.1.5/db_android/select.php";
    public static final String URL_UPDATE_EMP = "http://192.168.1.5/db_android/update.php";
    public static final String URL_DELETE_EMP = "http://192.168.1.5/db_android/delete.php";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "nama";
    public static final String KEY_EMP_JURUSAN = "jurusan"; //desg itu variabel untuk posisi
    public static final String KEY_EMP_EMAIL = "email"; //salary itu variabel untuk gajih

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "nama";
    public static final String TAG_JURUSAN = "jurusan";
    public static final String TAG_EMAIL = "email";

    //ID karyawan
    //emp itu singkatan dari Employee
    public static final String EMP_ID = "emp_id";
}