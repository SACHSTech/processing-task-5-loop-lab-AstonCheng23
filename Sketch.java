import processing.core.PApplet;

public class Sketch extends PApplet {

	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    /*
    stroke(128);
    line(150, 25, 270, 350);  

    stroke(255);
    line(50, 125, 70, 50);  
*/
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

    
  }


  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 35; intColumn++){
        intX = 3 + 10*intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = 303 + 10*intColumn; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */
  public void draw_section2(){
    int intX = 0;
    int intY = 0;
    int colour = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 35; intColumn++){
        intX = 303 + 10*intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = 303 + 10*intColumn; //Instead of zero, calculate the proper intY location using 'intColumn'

        
        int decide_colour = (intRow % 2);
        if(decide_colour == 0){
          colour = 255;
        } else {
          colour = 0;
        }

        fill(colour);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
  public void draw_section3(){
    int intX = 0;
    int intY = 0;
    int colour = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 35; intColumn++){
        intX = 603 + 10*intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = 303 + 10*intColumn; //Instead of zero, calculate the proper intY location using 'intColumn'

        
        int decide_colour = (intColumn % 2);
        if(decide_colour == 0){
          colour = 0;
        } else {
          colour = 255;
        }

        fill(colour);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }

  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 35; intColumn++){
        intX = 903 + 10*intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = 303 + 10*intColumn; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(0);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
    for(int intRow = 0; intRow < 30; intRow += 2){
      for(int intColumn = 1; intColumn < 35; intColumn += 2){
        intX = 903 + 10*intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = 303 + 10*intColumn; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){
    int intX = 0;
    int intY = 0;

    int intRow = 0;
    int intColumn = 0;

    for(intRow = 0; intRow < 30; intRow++){
      intX = 3 + 10*intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
      intY = 294 - 10*intColumn; //Instead of zero, calculate the proper intY location using 'intColumn'

      fill(intRow*(255/30));
      noStroke();
      rect(intX, intY, 5, 5);
      //rect(intY - 1, intX  1, 5, 5);

      for(intColumn = 0; intColumn < 1 + (intRow*(35/30)); intColumn++){
        intX = 3 + 10*intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = 294 - 10*intColumn; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(intColumn*(255/35));
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  public void draw_section6(){
    int intX = 0;
    int intY = 0;

    int intRow = 31;
    int intColumn = 0;

    for(intRow = 31; intRow > 0; intRow--){
      intX = 604 - 10*intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
      intY = 304 - 10*intColumn; //Instead of zero, calculate the proper intY location using 'intColumn'

      fill(intRow*(255/30));
      noStroke();
      rect(intX, intY, 5, 5);
      //rect(intY - 1, intX  1, 5, 5);

      for(intColumn = 0; intColumn < (intRow*(35/30) - 1); intColumn++){
        intX = 604 - 10*intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = 294 - 10*intColumn; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(intColumn*(255/35));
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }

  }

  public void draw_section7(){

    int intX = 0;
    int intY = 0;

    int intRow = 0;
    int intColumn = 35;

    for(intRow = 30; intRow > 0 ; intRow--){
      intX = 10*intRow + 604;  //Instead of zero, calculate the proper intX location using 'intRow'
      intY = 294 - 10*intColumn; //Instead of zero, calculate the proper intY location using 'intColumn'

      fill(intRow*(255/30));
      noStroke();
      rect(intX, intY, 5, 5);
      //rect(intY - 1, intX  1, 5, 5);

      for(intColumn = 35; intColumn > (intRow*(35/30)) - 1; intColumn--){
        intX = 10*intRow + 594;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = 304 - 10*intColumn; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(intColumn*(255/35));
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }

  }
  
  public void draw_section8(){
    int intX = 0;
    int intY = 0;

    int intRow = 0;
    int intColumn = 35;

    for(intRow = 30; intRow > 0; intRow--){
      intX = 1203 - 10*intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
      intY = 294 - 10*intColumn; //Instead of zero, calculate the proper intY location using 'intColumn'

      fill(intRow*(255/30));
      noStroke();
      rect(intX, intY, 5, 5);
      //rect(intY - 1, intX  1, 5, 5);

      for(intColumn = 35; intColumn > (intRow*(35/30)) - 2; intColumn--){
        intX = 1203- 10*intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = 294 - 10*intColumn; //Instead of zero, calculate the proper intY location using 'intColumn'
  
        fill(intColumn*(255/35));
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }
}
