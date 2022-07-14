// we will use this to add an array of all images that will be in the slideshow, then swap the src attribute on the image tag with the info inside each element in the array, when the user clicks the next button or the previous button.

// we Start with an IIFE.
;(() => {
  // step 1: create an array of all the images that will be in the slideshow
  const myImages = [
    'image1.jpg',
    'image2.jpg',
    'image3.jpg',
    'image4.jpg',
    'image5.jpg',
  ]

  // step 2: the first image in the array will be on the screen when the slideshow loads and that is the element nmber zero.
  let currentImage = 0

  // step 3: create an event handler that will use the 'onclick' event on the 'next' and 'previous' buttons.
  // get the id of next, add an onclick event and assign it to  function 'nextPhoto'
  document.getElementById('next').onclick = nextPhoto
  // get the id of previous, add an onclick event and assign it to  function 'previousPhoto'
  // document.getElementById('previous').onclick = previousPhoto
  // step 4: create a function nextPhoto
  function nextPhoto() {
    //increment by one on each click
    currentImage++
    // if the images reaches the last item in the array, let it go back to the first one
    if (currentImage > myImages.length - 1) {
      currentImage = 0
    }
    document.getElementById('myimage').src = myImages[currentImage]
  }
  //////////////////////////////////////////// USING THE ADDEVENTLISTNER FOR THE PREVIOUS BUTTON

  document.getElementById('previous').addEventListener('click', () => {
    currentImage--
    // if the images reaches the first item in the array, let it go back to the last one
    if (currentImage < 0) {
      currentImage = myImages.length - 1
    }
    document.getElementById('myimage').src = myImages[currentImage]
  })
  ///////////////////////////////////////////// USING THE ONCLICK PROPERTY FOR THE PREVIOUS BUTTON
  /*

  // step 5: create a function previousPhoto
  function previousPhoto() {
    //decrement by one on each click
    currentImage--
    // if the images reaches the first item in the array, let it go back to the last one
    if (currentImage < 0) {
      currentImage = myImages.length - 1
    }
    document.getElementById('myimage').src = myImages[currentImage]
  }
  */
})()
