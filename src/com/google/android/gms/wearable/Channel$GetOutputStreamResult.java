package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import java.io.OutputStream;

public abstract interface Channel$GetOutputStreamResult
  extends Releasable, Result
{
  public abstract OutputStream getOutputStream();
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.Channel.GetOutputStreamResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */