package com.google.android.gms.internal;

public final class zzsq
  implements Cloneable
{
  private static final zzsr zzbum = new zzsr();
  private int mSize;
  private boolean zzbun = false;
  private int[] zzbuo;
  private zzsr[] zzbup;
  
  zzsq()
  {
    this(10);
  }
  
  zzsq(int paramInt)
  {
    paramInt = idealIntArraySize(paramInt);
    zzbuo = new int[paramInt];
    zzbup = new zzsr[paramInt];
    mSize = 0;
  }
  
  private void gc()
  {
    int m = mSize;
    int[] arrayOfInt = zzbuo;
    zzsr[] arrayOfzzsr = zzbup;
    int i = 0;
    int k;
    for (int j = 0; i < m; j = k)
    {
      zzsr localzzsr = arrayOfzzsr[i];
      k = j;
      if (localzzsr != zzbum)
      {
        if (i != j)
        {
          arrayOfInt[j] = arrayOfInt[i];
          arrayOfzzsr[j] = localzzsr;
          arrayOfzzsr[i] = null;
        }
        k = j + 1;
      }
      i += 1;
    }
    zzbun = false;
    mSize = j;
  }
  
  private int idealByteArraySize(int paramInt)
  {
    int i = 4;
    for (;;)
    {
      int j = paramInt;
      if (i < 32)
      {
        if (paramInt <= (1 << i) - 12) {
          j = (1 << i) - 12;
        }
      }
      else {
        return j;
      }
      i += 1;
    }
  }
  
  private int idealIntArraySize(int paramInt)
  {
    return idealByteArraySize(paramInt * 4) / 4;
  }
  
  private boolean zza(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt)
  {
    int i = 0;
    while (i < paramInt)
    {
      if (paramArrayOfInt1[i] != paramArrayOfInt2[i]) {
        return false;
      }
      i += 1;
    }
    return true;
  }
  
  private boolean zza(zzsr[] paramArrayOfzzsr1, zzsr[] paramArrayOfzzsr2, int paramInt)
  {
    int i = 0;
    while (i < paramInt)
    {
      if (!paramArrayOfzzsr1[i].equals(paramArrayOfzzsr2[i])) {
        return false;
      }
      i += 1;
    }
    return true;
  }
  
  private int zzmH(int paramInt)
  {
    int j = mSize;
    int i = 0;
    j -= 1;
    while (i <= j)
    {
      int k = i + j >>> 1;
      int m = zzbuo[k];
      if (m < paramInt)
      {
        i = k + 1;
      }
      else
      {
        j = k;
        if (m <= paramInt) {
          return j;
        }
        j = k - 1;
      }
    }
    j = i ^ 0xFFFFFFFF;
    return j;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof zzsq)) {
        return false;
      }
      paramObject = (zzsq)paramObject;
      if (size() != ((zzsq)paramObject).size()) {
        return false;
      }
    } while ((zza(zzbuo, zzbuo, mSize)) && (zza(zzbup, zzbup, mSize)));
    return false;
  }
  
  public final int hashCode()
  {
    if (zzbun) {
      gc();
    }
    int j = 17;
    int i = 0;
    while (i < mSize)
    {
      j = (j * 31 + zzbuo[i]) * 31 + zzbup[i].hashCode();
      i += 1;
    }
    return j;
  }
  
  public final boolean isEmpty()
  {
    return size() == 0;
  }
  
  final int size()
  {
    if (zzbun) {
      gc();
    }
    return mSize;
  }
  
  public final zzsq zzJq()
  {
    int i = 0;
    int j = size();
    zzsq localzzsq = new zzsq(j);
    System.arraycopy(zzbuo, 0, zzbuo, 0, j);
    while (i < j)
    {
      if (zzbup[i] != null) {
        zzbup[i] = zzbup[i].zzJr();
      }
      i += 1;
    }
    mSize = j;
    return localzzsq;
  }
  
  final void zza(int paramInt, zzsr paramzzsr)
  {
    int i = zzmH(paramInt);
    if (i >= 0)
    {
      zzbup[i] = paramzzsr;
      return;
    }
    int j = i ^ 0xFFFFFFFF;
    if ((j < mSize) && (zzbup[j] == zzbum))
    {
      zzbuo[j] = paramInt;
      zzbup[j] = paramzzsr;
      return;
    }
    i = j;
    if (zzbun)
    {
      i = j;
      if (mSize >= zzbuo.length)
      {
        gc();
        i = zzmH(paramInt) ^ 0xFFFFFFFF;
      }
    }
    if (mSize >= zzbuo.length)
    {
      j = idealIntArraySize(mSize + 1);
      int[] arrayOfInt = new int[j];
      zzsr[] arrayOfzzsr = new zzsr[j];
      System.arraycopy(zzbuo, 0, arrayOfInt, 0, zzbuo.length);
      System.arraycopy(zzbup, 0, arrayOfzzsr, 0, zzbup.length);
      zzbuo = arrayOfInt;
      zzbup = arrayOfzzsr;
    }
    if (mSize - i != 0)
    {
      System.arraycopy(zzbuo, i, zzbuo, i + 1, mSize - i);
      System.arraycopy(zzbup, i, zzbup, i + 1, mSize - i);
    }
    zzbuo[i] = paramInt;
    zzbup[i] = paramzzsr;
    mSize += 1;
  }
  
  final zzsr zzmF(int paramInt)
  {
    paramInt = zzmH(paramInt);
    if ((paramInt < 0) || (zzbup[paramInt] == zzbum)) {
      return null;
    }
    return zzbup[paramInt];
  }
  
  final zzsr zzmG(int paramInt)
  {
    if (zzbun) {
      gc();
    }
    return zzbup[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzsq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */