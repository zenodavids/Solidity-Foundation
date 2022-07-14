// put all the codes inside the IIFE
;(() => {
  // 1 start the array from 0
  let currentImage = 0
  // 2 create an array of our images for the slideshow
  const myphotos = [
    'image1.jpg',
    'image2.jpg',
    'image3.jpg',
    'image4.jpg',
    'image5.jpg',
  ]
  // 3 get the slideshow pictures container
  const container = document.getElementById('content')
  // 4 get the next button
  const nxtBtn = document.getElementById('next')
  // 5 get the previous button
  const preBtn = document.getElementById('previous')
  //////////////// THE NEXT BUTTON
  // 6 add event listener for the next button
  nxtBtn.addEventListener('click', (e) => {
    // 7 prevents the browser from accesing the href attribute by default
    e.preventDefault()
    // 8 ithis should increment by one on every click
    currentImage++
    if (currentImage > myphotos.length - 1) {
      currentImage = 0
    }
    // add the swap image function
    swapImg()
  })

  //////////////// THE PREVIOUS BUTTON
  // 6 add event listener for the previous button
  preBtn.addEventListener('click', (e) => {
    // 7 prevents the browser from accesing the href attribute by default
    e.preventDefault()
    // 8 this should decrement by one on every click
    currentImage--
    if (currentImage < 0) {
      currentImage = myphotos.length - 1
    }
    // add the swap image function
    swapImg()
  })

  // 9a Adding the new slide on top
  const swapImg = () => {
    // 9b create a new image element
    let newSlide = document.createElement('img')
    // 9c we set its new source attribute and instead of putting the images 'image1.jpg' etc, we use the myphotos array
    newSlide.src = `slides/${myphotos[currentImage]}`
    // 9d give this variable a class name
    newSlide.className = 'fadeinimg'
    // 9e add this to the container in the webpage
    container.appendChild(newSlide)

    // the 9th steps causes our code to stacking up images. to aviod this, lets create an if else statement.
    // 10 if the pictures in the container are greater than two, we remove the bottom one
    if (container.children.length > 2) {
      container.removeChild(container.children[0])
    }
  }
})()
