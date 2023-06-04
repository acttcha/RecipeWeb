function toggleNavtabs() {
  var navtabs1 = document.getElementById("navtabs1");

  if (navtabs1.style.display === "none") {
    navtabs1.style.display = "block";
  } else {
    navtabs1.style.display = "none";
  }
}




// 스와이프


function visual__swiper(){
  var mySwiper = new Swiper('.visual>.swiper-container', {
  loop: true,
    autoplay: {
        delay: 3000,
        disableOnInteraction: true,
      },
  pagination: {
        el: '.visual .swiper-pagination',
        type: 'fraction',
      },
  navigation: {
    nextEl: '.visual .swiper-next',
    prevEl: '.visual .swiper-prev',
  },

});
  $('.visual .swiper-play').click(function(){
    mySwiper.autoplay.start();
  });
  $('.visual .swiper-stop').click(function(){
    mySwiper.autoplay.stop();
  });
}

function contents1__swiper(){
  var mySwiper = new Swiper('.contents-1 .swiper-container', {
  loop: true,
    autoplay: {
        delay: 1500,
        disableOnInteraction: false,
      },
  pagination: {
        el: '.contents-1 .swiper-pagination',
        type: 'fraction',
      },
  navigation: {
    nextEl: '.contents-1 .swiper-next',
    prevEl: '.contents-1 .swiper-prev',
  },

});
}

var contents4__swiper = new Swiper('.swiper-container', {
  loop: true,
  slidesPerView: 3,
  spaceBetween: 120,
  autoplay: {
        delay: 3000,
        disableOnInteraction: false,
      },

  navigation: {
    nextEl: '.button-next',
    prevEl: '.button-prev',
  },
})

visual__swiper();
contents1__swiper();