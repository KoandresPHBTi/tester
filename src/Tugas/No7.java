package Tugas;
public class No7 {
    public static void tampil(int []A){
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public static void insertionsort(int [] A){
        for (int i = 1; i < A.length; i++) {
            int m = A[i];
            int n = i -1;
            while((n>=0)&&(A[n]> m)){
                A[n + 1] = A[n];
                n--;
            }
            A[n+1]= m;
            
        }
    }
    public static void search(int [] A){
        int Data=13;
        System.out.println();
        System.out.println("Data yang dicari= "+Data);
        System.out.println();
        int batasawal = 0;
        int batasakhir = A.length -1;
        int ketemu = 0;
        int point = 0;
        while ((batasawal<=batasakhir)&&(ketemu ==0)){
            point = (batasawal+batasakhir)/2;
            if (A[point]==Data){
                ketemu = 1;
                
            }else{
                if (Data < A[point]){
                    System.out.println("Cari di kiri");
                    batasakhir = point -1;
                }else{
                    System.out.println("Cari di kanan");
                    batasawal = point + 1;
                }
            }
        }
        if(ketemu == 1){
            System.out.println("Data ditemukan pada indeks ke "+point);
        }else{
            System.out.println("Data tidak ditemukan");
        } 
    }
    public static void main(String[] args) {
        int [] A = {25,7,9,13,3};
        System.out.println("Data sebelum diurutkan : ");
        No7.tampil(A);
        No7.insertionsort(A);
        System.out.println("Data setelah diurutkan : ");
        No7.tampil(A);
        No7.search(A);
        System.out.println();
        System.out.println("Koandres (20090123)");
    }
}