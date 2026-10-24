package model;

/**
 * INFORMASI:
 * Masalah dari hanya menggunakan tahap SRP adalah setiap jenis baru memaksa kita membongkar/mengubah logic di method hitungBiaya() dalam blok if-else
 * dan validasi properti jenis(MOBIL/MOTOR) di Controller.
 * Solusinya Class Kendaraan dijadikan abstract, dan setiap jenis punya kelas sendiri.
 * Otomatis class Kendaraan tidak akan digunakan lagi.
 */

public abstract class Kendaraan {
        private final String platNomor;
        private final String merk;
        private final long tarifPerHari;
        private boolean tersedia = true;

        public Kendaraan(String platNomor, String merk, long tarifPerHari) {
                this.platNomor = platNomor;
                this.merk = merk;
                this.tarifPerHari = tarifPerHari;
        }

        //[OCP] Setiap subclass menentukan sendiri nama jenis & cara hitung biayanya.
        public abstract String getJenis();
        
        public abstract long hitungBiaya(int hari);

        public String getPlatNomor() { return platNomor; }
        public String getMerk() { return merk; }
        public long getTarifPerHari() { return tarifPerHari; }
        public boolean isTersedia() { return tersedia; }
        public void setTersedia(boolean tersedia) { this.tersedia = tersedia; }
}