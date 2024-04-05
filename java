const prevBtn = document.getElementById("prevBtn");
const nextBtn = document.getElementById("nextBtn");
const carouselSlide = document.querySelector(".carousel-slide");

let counter = 0;

nextBtn.addEventListener("click", () => {
    counter++;
    carouselSlide.style.transform = `translateX(${-counter * 100}%)`;
});

prevBtn.addEventListener("click", () => {
    counter--;
    carouselSlide.style.transform = `translateX(${-counter * 100}%)`;
});
