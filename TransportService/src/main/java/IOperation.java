import java.util.concurrent.Future;

public interface IOperation {
    Future<String> AsyncRead();
    Future AsyncWrite(final String message);
}
