/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maze_solver;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.JFrame;


/**
 *
 * @author 91894
 */
public class front extends JFrame{
    
    private int maze[][]={
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,1,1,1,0,0,1,0,0,0,0,0,1},
        {1,0,1,0,0,0,0,1,1,1,0,0,0,1},
        {1,0,1,0,1,1,0,0,0,0,1,1,1,1},
        {1,0,1,0,1,1,1,1,1,0,0,0,0,1},
        {1,0,0,0,0,0,0,1,1,1,1,1,0,1},
        {1,1,1,1,0,1,0,1,0,1,1,1,1,1},
        {1,0,0,0,0,1,0,0,0,0,0,0,9,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1}
    };
    
    public ArrayList<Integer> path=new ArrayList<>();
    
    public front()
    {
        setTitle("Maze Solver");
        setSize(700,500);
        setLayout(null);
        
        dfs.searchpath(maze, path, 1, 1);
        System.out.println(path);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
    @Override
    public void paint(Graphics g)
    {
        g.translate(80, 80);
        for(int i=0;i<maze.length;i++)
        {
            for(int j=0;j<maze[0].length;j++)
            {
                Color clr;
                switch(maze[i][j])
                {
                    case 1: clr=Color.BLACK; break;
                    case 9: clr=Color.red; break; //final point
                    default : clr=Color.white;
                    
                }
                
                g.setColor(clr); //sets clr to the elem
                g.fillRect(30*j, 30*i, 30, 30); //make the elem as rectange
                
                //border
                g.setColor(Color.red);
                g.drawRect(30*j, 30*i, 30, 30);
 
            }
        }
        
        for(int i=0;i<path.size();i+=2)
        {
            int x=path.get(i);
            int y=path.get(i+1);
            System.out.println("x:"+x+" y:"+y);
            
            g.setColor(Color.green);
            g.fillRect(30*x, 30*y, 30, 30);
        }
    }
    
    public static void main(String args[])
    {
        front obj=new front();
        obj.setVisible(true);
    }
    
    
}
