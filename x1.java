//////// Exercise x2:  modularize exercise x1, and add dog to chase hero.
//////// Whoever Whoever  (CST 112; today's date?)

//////// Please change these to your name and today's date.
String author=  "Whoever Whatever";
String title=  " ??? ";
String help=  " Click to relocate hero \n 'q' to quit; 'r' to reset. ";


//// GLOBALS:  coordinates, speed, etc.
float horizon;
float x, y;       // Position.
float dx, dy;     // Speed.
float dogX, dogY;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 640,480);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  scene();
  hero();
  dog();
  messages();
  
}

//// SCENE:  sky, sun, tree, house, etc.
void scene() {  
fill(0, 250, 206);
  background( 100,150,200 );                // sky
  fill( 255,255,0 );
  ellipse( width*3/4, height/8, 70,70 );    // sun
  
  
  // Grass
  stroke(0);
  fill( 100,200,100 );
  rect( 0,horizon, width,height*3/4 );   
  

      //GRASS LINES
      stroke(0);
      line(250, 250, 260 , 240);
      line(260, 240, 270, 250);
      line(270, 250, 280, 240);
      line(280, 240, 290, 250);
      
  
// tree
  fill(0,255,14);
  triangle( 400,100, 350,250, 450,250 );
  
  // tree trunk 
  fill(255,102,0);
  rect(385, 250, 30,120);
  line( 400, 250, 400, 275);
  line(390,250, 390, 280);
  line(390, 330, 390, 350);
  line( 411,300, 411, 350);
  fill(129, 75, 8);
  ellipse( 400, 300, 20, 50);
  
    // apple 
  stroke(0);
  fill( 198 , 100 , 102 );
  ellipse( 400, 170 , 10 , 10);
  ellipse(380, 200 , 10, 10);
  ellipse(410, 230, 10 ,10);
  line( 400, 165, 405,160);
  line(380, 195, 385, 190  );
  line( 410, 225, 405, 220  );
  
  
// text
  fill(255);
  text( "A+ PLS...", 200,horizon );
  
// house
     fill(238,89,80);
     stroke(0);
     rect( 100, 150 , 100, 130);

          //roof of the house

          stroke(0);
          fill(75,89,80);
          triangle(100,150,200,150,150,100);

            // door 
            stroke(0);
            fill(20,100,100);
            rect(130 , 230 , 30,50);

              //door knob
              fill(21,206,189);
              ellipse(137,255,10,10);
              
              //window
              rect(140,160,50,50);
              fill(255);
              rect(145,165, 20,20);
}

void messages() {
  text( title, width/3, 20 );
  text( help, width*2/3, 30 );
  text( author, 10,height-20 );
}

//// ACTION:  move (x,y) coordinates of hero & dog; show them.
void hero() {
  fill(0);
  text( "ChAr1i3 LIVES!!!", 230, 200 );
  
  //Charlies head
  stroke(178 , 0 ,255);
  fill(178, 0 , 255);
  ellipse(x + 15 , y , 30 , 30);
  
  // charlies body
  stroke( 178 , 0 , 255);
  fill(178 , 0, 255); 
  rect( x,y, 30,50 ); 
  
  //charlies left eye
  stroke (0 );
  fill(246,255,0);
  ellipse( x+ 5 , y + 10, 5 ,5 );
  
  //charlies right eye
  stroke(0);
  fill(246, 255, 0);
  ellipse( x + 20, y + 10 ,5 ,5);
  
  //charlies mouth
  stroke( 0 ) ;
  fill(0 , 63 , 243);
  ellipse( x + 10 , y + 30 , 10 , 20);
  
  // charlies name its under him
  fill(0);
  text( "ChAR1i3", x,y + 70);
  
  //charlies arms
  fill(178, 0, 255);
  stroke(178, 0 , 255);
  rect( x - 20, y + 20 , 20, 10);
  stroke(0);
  fill(178, 0, 255);
  rect(x + 20, y + 20, 20, 10);
  
  //charlies hair
  line(x+10, y  - 10, x + 15, y - 25);
  line(x + 20, y - 10, x + 19, y - 25);
}
void dog() {
  dogX=  dogX - (dogX-x)/30;
  dogY=  dogY - (dogY-y)/40;
  text( dogX, 10, 10 );
  text( dogY, 10, 20 );
  //
  fill( 150,0,0 );
  rect(dogX,dogY, 60,30 );
  /* INSERT YOUR CODE HERE! */
  /* REPLACE THIS STUB! */  text( "woof, woof!d!!", 150, 150 );
}





//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  //
  dx=  random( -6, +6 );                  // random speed.
  dy=  random( -4, +4 );
}

void keyPressed() {
  if (key == 'q') {
    exit();                           // press 'q' key to QUIT.
  }
  /* INSERT YOUR CODE HERE! */
}
   
   

