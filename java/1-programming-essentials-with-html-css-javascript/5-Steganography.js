/* *
* * STEGANOGRAPHY

 This is the hiding of data in an image or other digital artifacts

- the big idea is to hide one image in another.
  -- minor numerical change: look same
- we achieve this using binary, not decimal(0 to 255, not 0 to 9999)

 * * Binary
  to work with steganography, we'll use binary numbers.
  this base 2 numbers with only two digits; 1s and 0s. ie,
    the binary number of 10111 is (starting from the right to left);
    1 * 1
    1 * 2
    1 * 4
    0 * 8
    1 * 16

  RGB values values ranges from 0 to 255 because they are stored with 8 binary digits called 'bits'
  11111111 = 255
  00000000 = 0

 * * bits
  bits is culled from binary(b) and digits(its)

 * STEGANOGRAPHY with binary
  lets hide A in B, where;
  A is 10110010,
  B is 01110101
 * hide this         in this   =    result
  10110010          01110101   =   01111011
we got the 'result' by putting together B's the first four digits (0111) and A's first four digits (1011)
 */

/**
 * *  USING JAVASCRIPT with the above example to hide image in image ;
 since we need the first 4 digits, we do 2**4 (2 to the power of four) which is 16
 */

const a = Math.floor(10110010 / 16) // getting A first four numbers
console.log(a)

const b = Math.floor(01110101 / 16) // getting B first four numbers
console.log(b)

result = b * 16 + a //getting the 'result'

/**
 * *  USING JAVASCRIPT with the above example to extract the hidden image ;
 using the result;
 */

// separating A from result
separateA = (01111011 % 16) * 16 // separate A and add extra 4 zeros
////////////////////////////////////////////////////////

/**
 * * STEGANOGRAPHY as JAVASCRIPT FUNCTION
 */
//////
// HIDE IMAGE A IN IMAGE B

// for the image that will HIDE the other image (IMAGE B)

const clearBits = (pixVal) => (x = Math.floor(pixVal / 16) * 16)
// compute the same color value with the low bits zeroed

const chop2hide = (image) => {
  for (var px of image.values()) {
    // for each pixel in the image...

    px.setRed(clearBits(px.getRed()))
    // clear the low bits of the red

    px.setGreen(clearBits(px.getGreen()))
    // clear the low bits of the green

    px.setBlue(clearBits(px.getBlue()))
    // clear the low bits of the blue
  }
  return image
}

// the image that will be hidden (IMAGE A)
const shift = (image) => {
  for (var px of image.values()) {
    // for each pixel in the image...

    px.setRed(px.getRed() / 16)
    // shift the red bits over

    px.setGreen(px.getGreen() / 16)
    // shift the green bits over

    px.setBlue(px.getBlue() / 16)
    // shift the blue bits over
  }
  return image
}

// combine the two images
const combine = (show, hide) => {
  let answer = new SimpleImage(show.getWidth(), show.getHeight())
  // make a new image the same size as 'show' (call it answer)

  for (var px of image.values()) {
    // fro each pixel in answer,

    let x = px / getX()
    let y = px / getY()
    // get the x and y of that pixel

    let showPixel = show.getPixel(x, y)
    // get the pixel in the same place for show

    let hidePixel = hide.getPixel(x, y)
    // get the pixel in the same place for hide

    px.setRed(showPixel.getRed() + hidePixel.getRed())
    // set the red of px th the sum of showPixels's red + hidePixel's red

    px.setGreen(showPixel.getGreen() + hidePixel.getGreen())
    // set the green of px th the sum of showPixels's green + hidePixel's green

    px.setBlue(showPixel.getBlue() + hidePixel.getBlue())
    // set the blue of px th the sum of showPixels's blue + hidePixel's blue
  }

  return answer
}

let start = new SimpleImage('usain.jpg')
let hide = new SimpleImage('skyline.jpg')

start = chop2hide(start)
hide = shift(hide)
let ans = combine(start, hide)
print(ans)
///////

// EXTRACT THE HIDDEN IMAGE
