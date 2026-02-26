document.querySelectorAll('.btn-pesan').forEach(button => {
    button.addEventListener('click', function() {
        const packageName = this.parentElement.querySelector('h3').innerText;
        const waNumber = "6282312559796"; // Nomor Danish
        const text = `Halo Danish, saya tertarik dengan paket *${packageName}* yang saya lihat di website. Bisa bantu jelaskan prosesnya?`;
        const url = `https://wa.me/${waNumber}?text=${encodeURIComponent(text)}`;
        
        window.open(url, '_blank');
    });
});

// Efek Smooth Scroll untuk Navigasi
document.querySelectorAll('a[href^="#"]').forEach(anchor => {
    anchor.addEventListener('click', function (e) {
        e.preventDefault();
        document.querySelector(this.getAttribute('href')).scrollIntoView({
            behavior: 'smooth'
        });
    });
});