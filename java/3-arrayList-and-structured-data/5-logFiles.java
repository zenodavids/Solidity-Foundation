/*
 * google 'apache 2.4 web server log file format' and read documentation

 110.76.104.12 - - [30/sep/2015:07:47:11 -0400] "GET //favicon.ico HTTP/1.1" 200 3246

 *  110.76.104.12 - ip address of the visitor's device  => string
 * - missing info about visitor
 * - for user name if they are logged in http authentication
 * date and time request was made  => date(inbuilt java lib)
 * website  => string
 * statusCode   => int
 * bytes   => int
 */