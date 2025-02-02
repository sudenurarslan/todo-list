import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private static ArrayList<String> gorevler = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTo-Do List Uygulaması");
            System.out.println("1 - Görev Ekle");
            System.out.println("2 - Görevleri Listele");
            System.out.println("3 - Görevi Tamamla");
            System.out.println("4 - Çıkış");
            System.out.println("5 - Tüm Görevleri Temizle");

            System.out.print("Seçiminizi yapın: ");

            int secim = scanner.nextInt();
            scanner.nextLine(); // Boş satır okuma

            switch (secim) {
                case 1:
                    System.out.print("Yeni görevi girin: ");
                    String gorev = scanner.nextLine();
                    gorevler.add(gorev);
                    System.out.println("Görev eklendi.");
                    break;
                case 2:
                    if (gorevler.isEmpty()) {
                        System.out.println("Henüz bir görev eklenmedi.");
                    } else {
                        System.out.println("Yapılacak Görevler:");
                        for (int i = 0; i < gorevler.size(); i++) {
                            System.out.println((i + 1) + ". " + gorevler.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Tamamlanan görevin numarasını girin: ");
                    int tamamlananGorev = scanner.nextInt() - 1;
                    if (tamamlananGorev >= 0 && tamamlananGorev < gorevler.size()) {
                        gorevler.remove(tamamlananGorev);
                        System.out.println("Görev tamamlandı ve listeden çıkarıldı.");
                    } else {
                        System.out.println("Geçersiz numara.");
                    }
                    break;
                case 4:
                    System.out.println("Çıkılıyor...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Geçersiz seçim, tekrar deneyin.");
                case 5:
                    gorevler.clear();
                    System.out.println("Tüm görevler temizlendi.");
                    break;

            }
        }
    }
}
