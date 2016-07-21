package org.apache.http.impl.io;

import org.apache.http.HttpMessage;
import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineFormatter;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

public abstract class AbstractMessageWriter
  implements HttpMessageWriter
{
  protected final CharArrayBuffer lineBuf;
  protected final LineFormatter lineFormatter;
  protected final SessionOutputBuffer sessionBuffer;
  
  public AbstractMessageWriter(SessionOutputBuffer paramSessionOutputBuffer, LineFormatter paramLineFormatter, HttpParams paramHttpParams)
  {
    throw new RuntimeException("Stub!");
  }
  
  public void write(HttpMessage paramHttpMessage)
  {
    throw new RuntimeException("Stub!");
  }
  
  protected abstract void writeHeadLine(HttpMessage paramHttpMessage);
}

/* Location:
 * Qualified Name:     org.apache.http.impl.io.AbstractMessageWriter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */