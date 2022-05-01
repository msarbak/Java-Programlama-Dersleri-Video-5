package yt.video5;

public class Sayi {
    //	private int deger;
    //	private int uzunluk;
        
        public int deger;
        public int uzunluk;
        
        public Sayi(int dgr) {
            deger = dgr;
            uzunluk = String.valueOf(dgr).length();	
        }
        public short[] rakamlar() {
            int tmp = deger;
            short[] basamaklar = new short[uzunluk];
            int indeks = uzunluk-1;
            while(tmp > 0) {
                basamaklar[indeks--] = (short)(tmp%10);
                tmp = tmp/=10;
            }
            return basamaklar;
        }
        
        public int getUzunluk() {
            return uzunluk;
        }
        
        
        public boolean asalmi(int ...bolen) { //boleni dizi yapiyor 
        if(bolen.length == 0) return asalmi(2);
        if(bolen[0] == deger) return true;
        if(deger%bolen[0] == 0) return false;
        return asalmi(bolen[0]+1);
    }
        
        private int faktoriyel(int dgr) {
            if(dgr <= 1) return 1;
            return dgr*faktoriyel(dgr-1);
        }
        public int faktoriyel() {
            return faktoriyel(deger);
        }
        
        
    }