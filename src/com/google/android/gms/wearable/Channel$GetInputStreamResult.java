package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import java.io.InputStream;

public abstract interface Channel$GetInputStreamResult
  extends Releasable, Result
{
  public abstract InputStream getInputStream();
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.Channel.GetInputStreamResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */