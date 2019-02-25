package br.com.fiap.exception;

public class CodigoInvalidoException extends Exception {

  public CodigoInvalidoException() {
    super();
  }

  public CodigoInvalidoException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
    super(arg0, arg1, arg2, arg3);
  }

  public CodigoInvalidoException(String arg0, Throwable arg1) {
    super(arg0, arg1);
  }

  public CodigoInvalidoException(String arg0) {
    super(arg0);
  }

  public CodigoInvalidoException(Throwable arg0) {
    super(arg0);
  }

}
