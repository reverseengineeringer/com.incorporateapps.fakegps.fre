package com.google.android.gms.common.data;

import android.os.Bundle;
import java.util.Iterator;

public abstract class AbstractDataBuffer
  implements DataBuffer
{
  protected final DataHolder zzahi;
  
  protected AbstractDataBuffer(DataHolder paramDataHolder)
  {
    zzahi = paramDataHolder;
    if (zzahi != null) {
      zzahi.zzu(this);
    }
  }
  
  public final void close()
  {
    release();
  }
  
  public abstract Object get(int paramInt);
  
  public int getCount()
  {
    if (zzahi == null) {
      return 0;
    }
    return zzahi.getCount();
  }
  
  public boolean isClosed()
  {
    return (zzahi == null) || (zzahi.isClosed());
  }
  
  public Iterator iterator()
  {
    return new zzb(this);
  }
  
  public void release()
  {
    if (zzahi != null) {
      zzahi.close();
    }
  }
  
  public Iterator singleRefIterator()
  {
    return new zzg(this);
  }
  
  public Bundle zzpZ()
  {
    return zzahi.zzpZ();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.data.AbstractDataBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */