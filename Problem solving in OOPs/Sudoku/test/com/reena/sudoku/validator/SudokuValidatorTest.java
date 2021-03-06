package com.reena.sudoku.validator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.reena.sudoku.validator.SudokuValidator;
import com.reena.sudoku.validator.SumSudokuValidator;

public class SudokuValidatorTest {
	int[][] sMatrix={
            {5,3,4,6,7,8,9,1,2},
            {6,7,2,1,9,5,3,4,8},
            {1,9,8,3,4,2,5,6,7},
            {8,5,9,7,6,1,4,2,3},
            {4,2,6,8,5,3,7,9,1},
            {7,1,3,9,2,4,8,5,6},
            {9,6,1,5,3,7,2,8,4},
            {2,8,7,4,1,9,6,3,5},
            {3,4,5,2,8,6,1,7,9}
	};
            
	SudokuValidator sudokuValidator = new SumSudokuValidator(3);
	SudokuValidator sudokuValidator2 = new XORSudokuValidator(3);
	
	@Test
	public void validateSudokuBySum() throws Exception {
		assertTrue(sudokuValidator.validate(sMatrix));
	}
	
	@Test
	public void validateSudokuSum_emptyField() throws Exception {
		sMatrix[4][1]=0;
		assertFalse(sudokuValidator.validate(sMatrix));
	}
	
	@Test
	public void validateSudokuByXOR() throws Exception {
		assertTrue(sudokuValidator2.validate(sMatrix));
	}
	
	@Test
	public void validateSudokuXOR_emptyField() throws Exception {
		sMatrix[4][1]=0;
		assertFalse(sudokuValidator2.validate(sMatrix));
	}
}
