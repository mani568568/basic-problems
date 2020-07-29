package com.m.g.arrays;

public class CountIslands {

    public int countIslands(int [][] grid) {

        // variable for return type...
        int count = 0;

        // Base Condition:
        // if the grid is empty
        if(grid == null || grid.length==0 || grid[0].length==0)
        {
            return 0;
        }

        // walk across each row in the grid.
        for(int rows =0; rows<grid.length; rows++)
        {
            // walk across each column in the grid.
            for(int cols = 0; cols < grid[0].length ; cols++)
            {
                // finding the island.
                if(grid[rows][cols]==1)
                {
                    // if island is found incrementing the count.
                    count++;

                    // searching the 4 directions of the grid from the current position.
                    updateLandToWater(grid,rows,cols);
                }
            }
        }

        return count;
    }

    private void updateLandToWater(int[][] grid, int rows, int cols) {

        // Base Condition:
        // rows should not be less than zero and not greater than the rows length...
        // cols should not be less than zero and not greater than the cols length...
        // grid should not contain zero in the current position...
        // if any one of the current condition is met return nothing....
        if(rows<0 || cols<0 || rows>=grid.length || cols>=grid[0].length || grid[rows][cols]==0)
            return;

        // if the current grid is land then perform the following operations...
        if(grid[rows][cols]==1)
        {
            // making the current grid to water...
            grid[rows][cols]=0;

            // search the right grid from the current grid position...
            updateLandToWater(grid,rows,cols+1);

            // search the left grid from the current grid position...
            updateLandToWater(grid,rows,cols-1);

            // search the top grid from the current grid position...
            updateLandToWater(grid,rows+1,cols);

            // search the bottom grid from the current grid position...
            updateLandToWater(grid,rows-1,cols);
        }

    }
}
