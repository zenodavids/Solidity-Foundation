;(() => {
  'use strict'
  ///// step 1: set up all the variables to use.
  // for the conversion
  let convertType = 'miles'
  // this grabs the h1 element
  const heading = document.querySelector('h1')
  // this grabs the first p element
  const intro = document.querySelector('p')
  // this grabs the id value
  const answerDiv = document.getElementById('answer')
  // this grabs the id vqlue
  const form = document.getElementById('convert')

  ///// step 2: add two event listeners
  // 2a this will handle the keyDown
  document.addEventListener('keydown', (e) => {
    // since event.which is depreciated, we use event.code - this tells which key was pressed
    var key = e.code
    // alert(key)
    if (key === 'KeyK') {
      // change the heading
      convertType = 'kilometers'
      // change the intro paragraph
      heading.innerHTML = 'Kilometers to Miles Converter'
      // change the value of the conversionType variable
      intro.innerHTML =
        'Type in a number of kilometers and click the button to convert the distance to miles.'
    } else if (key === 'KeyM') {
      // change the heading
      convertType = 'miles'
      // change the intro paragraph
      heading.innerHTML = 'Miles to Kilometers Converter'
      // change the value of the conversionType variable
      intro.innerHTML =
        'Type in a number of miles and click the button to convert the distance to kilometers.'
    }
  })

  // 2b this handles the form submittion
  form.addEventListener('submit', (e) => {
    // prevents default behaviour
    e.preventDefault()
    // get the data the user inputs and convert it to a float
    const distance = parseFloat(document.getElementById('distance').value)

    if (distance) {
      // 3 convert M TO k 1.689344
      if (convertType == 'miles') {
        // 3a multiply distance and get the first 3 numbers after the decimal point(.toFixed())
        const converted = (distance * 1.609344).toFixed(3)

        // 3b ...and replace it with the answer we get back
        answerDiv.innerHTML = ` The ${distance} miles converts to ${converted} Kilometers`

        // 4 convert K to M 0.621371192
      } else {
        // 4a multiply distance and get the first 3 numbers after the decimal point(.toFixed())
        const converted = (distance * 0.621371192).toFixed(3)

        // 4b ...and replace it with the answer we get back
        answerDiv.innerHTML = `The ${distance} kilometers converts to ${converted} miles`
      }
    } else {
      answerDiv.innerHTML = `<h2>Please provide a number</h2>`
    }
  })
})()
