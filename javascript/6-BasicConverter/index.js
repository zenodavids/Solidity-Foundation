;(() => {
  'use strict'

  // 1 capture the event listener for the form submitted
  document.getElementById('convert').addEventListener('submit', (e) => {
    // 2 this keeps the form from refreshing the page and submitting the form to the php file
    e.preventDefault()
    // 3 the value property takes what ever user types in the input and puts it in this variable
    /**
   * by default, javascript sees every data inputed as a string. so the only way to pass in a number is by using the
   * parseInt() =this gets only integars,
   * and the parseFloat() = this gets integars and floats (decimal numbers) and
    since we want to get integars and floats in this case, we use the parseFloat()method
   */

    let distance = parseFloat(document.getElementById('distance').value)
    // 4 access the id representing the answer...
    let answer = document.getElementById('answer')
    if (distance) {
      // 5 multiply distance and get the first 3 numbers after the decimal point(.toFixed())
      let conversion = (distance * 1.609344).toFixed(3)

      // 6 ...and replace it with the answer we get back
      answer.innerHTML = `<h2> The Distance miles converts to ${conversion} Kilometers</h2>`
    } else {
      answer.innerHTML = `<h2>Please provide a number</h2>`
    }
  })
})()
