/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author azamchaiforoush
 */
public class RockPaperScissors {


    public static void main(String[] args){
        
        Scanner Sc = new Scanner(System.in);
        Random rand =new Random();
        int num;
        
         System.out.println("Welcom to Rock, Paper, Scissors!");
         System.out.println("Please choose R=Rock, P=Paper, S=Scissors.");
         
        String userChoice = "";
        String computerChoice = "";
    
        userChoice = Sc.nextLine();
         
        //Repeat this section
        for(int i=0; i<3; i++)
        { 
        
       //Computer choice
         num = rand.nextInt(3);
        
       
         if(num == 0)
        {
            computerChoice ="R";
        }            
         else if(num == 1)
        {
            computerChoice ="P";
        }            
         else if(num == 2)
        {
            computerChoice ="S";
        } 
         
        //Print the computer choice
        if(computerChoice.equals("R"))
        {
          System.out.println("The computer choose Rock.");   
        }
        
          else if(computerChoice.equals("P"))
          {
          System.out.println("The computer choose Paper."); 
          }  
         
          else if(computerChoice.equals("S"))
           {
          System.out.println("The computer choose Scissors."); 
           }
           
           // Determine a winner
          if(userChoice.equals("R") && num==2)
          {
              System.out.println("The user won."); 
          } 
          else if(userChoice.equals("P") && num==0)
          {
              System.out.println("The user won."); 
          } 
          else if(userChoice.equals("S") && num==1)
          {
              System.out.println("The user won."); 
          } 
          
          
           
           if(userChoice.equals("S") && num==0)
          {
              System.out.println("The computer won."); 
          } 
          else if(userChoice.equals("R") && num==1)
          {
              System.out.println("The computer won."); 
          } 
          else if(userChoice.equals("P") && num==2)
          {
              System.out.println("The computer won."); 
          } 
           
          else if (userChoice.equals("computerChoice"))
          {
          System.out.println("Tie!");
           }       
         //End repeat here 
        
    }    
            
           }  
    }
    
    


    

