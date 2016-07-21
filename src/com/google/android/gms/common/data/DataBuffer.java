package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.api.Releasable;
import java.util.Iterator;

public abstract interface DataBuffer
  extends Releasable, Iterable
{
  public abstract void close();
  
  public abstract Object get(int paramInt);
  
  public abstract int getCount();
  
  public abstract boolean isClosed();
  
  public abstract Iterator iterator();
  
  public abstract void release();
  
  public abstract Iterator singleRefIterator();
  
  public abstract Bundle zzpZ();
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.data.DataBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */