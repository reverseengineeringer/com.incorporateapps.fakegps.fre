package com.google.android.gms.common.data;

import java.util.NoSuchElementException;

public class zzg
  extends zzb
{
  private Object zzajy;
  
  public zzg(DataBuffer paramDataBuffer)
  {
    super(paramDataBuffer);
  }
  
  public Object next()
  {
    if (!hasNext()) {
      throw new NoSuchElementException("Cannot advance the iterator beyond " + zzajc);
    }
    zzajc += 1;
    if (zzajc == 0)
    {
      zzajy = zzajb.get(0);
      if (!(zzajy instanceof zzc)) {
        throw new IllegalStateException("DataBuffer reference of type " + zzajy.getClass() + " is not movable");
      }
    }
    else
    {
      ((zzc)zzajy).zzbF(zzajc);
    }
    return zzajy;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.data.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */