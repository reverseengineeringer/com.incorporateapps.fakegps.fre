package org.apache.http.impl.io;

import org.apache.http.HttpMessage;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineFormatter;
import org.apache.http.params.HttpParams;

public class HttpResponseWriter
  extends AbstractMessageWriter
{
  public HttpResponseWriter(SessionOutputBuffer paramSessionOutputBuffer, LineFormatter paramLineFormatter, HttpParams paramHttpParams)
  {
    super(null, null, null);
    throw new RuntimeException("Stub!");
  }
  
  protected void writeHeadLine(HttpMessage paramHttpMessage)
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.impl.io.HttpResponseWriter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */