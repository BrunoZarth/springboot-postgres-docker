package com.example.com.brunozarth.entity.form;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;


public class MatriculaForm {

  public MatriculaForm(Long alunoId) {
    this.alunoId = alunoId;
  }

  public MatriculaForm() {
  }

  @NotNull(message = "Preencha o campo corretamente.")
  @Positive(message = "O Id do aluno precisa ser positivo.")
  private Long alunoId;

  public Long getAlunoId() {
    return alunoId;
  }

  public void setAlunoId(Long alunoId) {
    this.alunoId = alunoId;
  }
}
