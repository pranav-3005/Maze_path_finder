/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maze_solver;
import java.util.*;
/**
 *
 * @author 91894
 */
public class dfs {
    public static boolean searchpath(int [][] maze,ArrayList<Integer> path,int x,int y)
    {
        //recursion
        
        if(maze[y][x]==9)
        {
            path.add(x);
            path.add(y);
            return true;
        }
        
        if(maze[y][x]==0)
        {
            maze[y][x]=2;
            
            if(searchpath(maze,path,x-1,y))
            {
                path.add(x);
                path.add(y);
                return true;
            }
            
            if(searchpath(maze,path,x+1,y))
            {
                path.add(x);
                path.add(y);
                return true;
            }
            
            if(searchpath(maze,path,x,y-1))
            {
                path.add(x);
                path.add(y);
                return true;
            }
            
            if(searchpath(maze,path,x,y+1))
            {
                path.add(x);
                path.add(y);
                return true;
            }
        }
        
        return false;
    }
}
