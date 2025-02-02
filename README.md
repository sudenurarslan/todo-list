
# todo-list

README.md – Git & GitHub Kullanımı ile To-Do List Projesi

✅ Java To-Do List Uygulaması
📌 Proje Amacı
Bu proje, kullanıcıların görev ekleyebildiği, listeleyebildiği ve tamamlayabildiği basit bir To-Do List (Yapılacaklar Listesi) uygulamasıdır.
Proje kapsamında Git ve GitHub’ın temel ve ileri seviye kullanımını öğrenmek, versiyon kontrolü yapmak hedeflenmiştir.
git init                   # Yeni bir Git repository başlatır
git clone <repo-url>       # Uzak (remote) bir repository’yi bilgisayara indirir
git add .                  # Tüm değişiklikleri sahneye (staging) ekler
git commit -m "Mesaj"      # Değişiklikleri kaydeder
git push origin main       # Güncellenmiş kodları GitHub'a gönderir
git pull origin main       # GitHub'daki en son değişiklikleri çeker
git status                 # Yapılan değişiklikleri ve sahneye eklenen dosyaları gösterir
git log                    # Commit geçmişini gösterir
git branch                 # Mevcut branchleri listeler
git branch yeni-ozellik    # Yeni bir branch oluşturur
git checkout yeni-ozellik  # Belirtilen branch’e geçiş yapar
git merge yeni-ozellik     # Branch'i ana branch ile birleştirir
git rebase main            # Branch’i main branch ile yeniden düzenler
git stash                  # Değişiklikleri geçici olarak saklar
git stash pop              # Saklanan değişiklikleri geri yükler
git reset --soft HEAD~1    # Son commit’i geri alır ama dosyaları korur
git reset --hard HEAD~1    # Son commit’i tamamen siler
git revert HEAD            # Son commit’i geri alır ama commit geçmişini korur
