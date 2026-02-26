document.addEventListener("DOMContentLoaded", function() {
    const nomorWA = "6282312559796"; // Nomor aslimu

    const tombolPesan = document.querySelectorAll('.btn-pesan');
    
    tombolPesan.forEach(tombol => {
        tombol.addEventListener('click', function() {
            // Mengambil judul jasa dari elemen terdekat
            const kartu = this.closest('.card');
            const namaJasa = kartu.querySelector('h3').innerText;
            
            // Format pesan
            const pesan = `Halo, saya mendapat info dari website Digital Service Bandung. Saya tertarik untuk konsultasi mengenai layanan *${namaJasa}*. Bagaimana prosedur selanjutnya?`;
            
            // Buka WhatsApp
            const linkWA = `https://wa.me/${nomorWA}?text=${encodeURIComponent(pesan)}`;
            window.open(linkWA, '_blank');
        });
    });
});