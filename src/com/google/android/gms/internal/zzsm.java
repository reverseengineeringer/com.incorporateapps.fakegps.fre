package com.google.android.gms.internal;

public final class zzsm
{
  private final byte[] buffer;
  private int zzbtZ;
  private int zzbua;
  private int zzbub;
  private int zzbuc;
  private int zzbud;
  private int zzbue = Integer.MAX_VALUE;
  private int zzbuf;
  private int zzbug = 64;
  private int zzbuh = 67108864;
  
  private zzsm(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    buffer = paramArrayOfByte;
    zzbtZ = paramInt1;
    zzbua = (paramInt1 + paramInt2);
    zzbuc = paramInt1;
  }
  
  public static zzsm zzD(byte[] paramArrayOfByte)
  {
    return zza(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  private void zzJj()
  {
    zzbua += zzbub;
    int i = zzbua;
    if (i > zzbue)
    {
      zzbub = (i - zzbue);
      zzbua -= zzbub;
      return;
    }
    zzbub = 0;
  }
  
  public static zzsm zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new zzsm(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public static long zzan(long paramLong)
  {
    return paramLong >>> 1 ^ -(1L & paramLong);
  }
  
  public static int zzmp(int paramInt)
  {
    return paramInt >>> 1 ^ -(paramInt & 0x1);
  }
  
  public final int getPosition()
  {
    return zzbuc - zzbtZ;
  }
  
  public final byte[] readBytes()
  {
    int i = zzJf();
    if ((i <= zzbua - zzbuc) && (i > 0))
    {
      byte[] arrayOfByte = new byte[i];
      System.arraycopy(buffer, zzbuc, arrayOfByte, 0, i);
      zzbuc = (i + zzbuc);
      return arrayOfByte;
    }
    if (i == 0) {
      return zzsx.zzbuD;
    }
    return zzmt(i);
  }
  
  public final double readDouble()
  {
    return Double.longBitsToDouble(zzJi());
  }
  
  public final float readFloat()
  {
    return Float.intBitsToFloat(zzJh());
  }
  
  public final String readString()
  {
    int i = zzJf();
    if ((i <= zzbua - zzbuc) && (i > 0))
    {
      String str = new String(buffer, zzbuc, i, "UTF-8");
      zzbuc = (i + zzbuc);
      return str;
    }
    return new String(zzmt(i), "UTF-8");
  }
  
  public final int zzIX()
  {
    if (zzJl())
    {
      zzbud = 0;
      return 0;
    }
    zzbud = zzJf();
    if (zzbud == 0) {
      throw zzst.zzJv();
    }
    return zzbud;
  }
  
  public final void zzIY()
  {
    int i;
    do
    {
      i = zzIX();
    } while ((i != 0) && (zzmo(i)));
  }
  
  public final long zzIZ()
  {
    return zzJg();
  }
  
  public final long zzJa()
  {
    return zzJg();
  }
  
  public final int zzJb()
  {
    return zzJf();
  }
  
  public final boolean zzJc()
  {
    return zzJf() != 0;
  }
  
  public final int zzJd()
  {
    return zzmp(zzJf());
  }
  
  public final long zzJe()
  {
    return zzan(zzJg());
  }
  
  public final int zzJf()
  {
    int i = zzJm();
    if (i >= 0) {}
    int k;
    do
    {
      return i;
      i &= 0x7F;
      j = zzJm();
      if (j >= 0) {
        return i | j << 7;
      }
      i |= (j & 0x7F) << 7;
      j = zzJm();
      if (j >= 0) {
        return i | j << 14;
      }
      i |= (j & 0x7F) << 14;
      k = zzJm();
      if (k >= 0) {
        return i | k << 21;
      }
      j = zzJm();
      k = i | (k & 0x7F) << 21 | j << 28;
      i = k;
    } while (j >= 0);
    int j = 0;
    for (;;)
    {
      if (j >= 5) {
        break label133;
      }
      i = k;
      if (zzJm() >= 0) {
        break;
      }
      j += 1;
    }
    label133:
    throw zzst.zzJu();
  }
  
  public final long zzJg()
  {
    int i = 0;
    long l = 0L;
    while (i < 64)
    {
      int j = zzJm();
      l |= (j & 0x7F) << i;
      if ((j & 0x80) == 0) {
        return l;
      }
      i += 7;
    }
    throw zzst.zzJu();
  }
  
  public final int zzJh()
  {
    return zzJm() & 0xFF | (zzJm() & 0xFF) << 8 | (zzJm() & 0xFF) << 16 | (zzJm() & 0xFF) << 24;
  }
  
  public final long zzJi()
  {
    int i = zzJm();
    int j = zzJm();
    int k = zzJm();
    int m = zzJm();
    int n = zzJm();
    int i1 = zzJm();
    int i2 = zzJm();
    int i3 = zzJm();
    long l = i;
    return (j & 0xFF) << 8 | l & 0xFF | (k & 0xFF) << 16 | (m & 0xFF) << 24 | (n & 0xFF) << 32 | (i1 & 0xFF) << 40 | (i2 & 0xFF) << 48 | (i3 & 0xFF) << 56;
  }
  
  public final int zzJk()
  {
    if (zzbue == Integer.MAX_VALUE) {
      return -1;
    }
    int i = zzbuc;
    return zzbue - i;
  }
  
  public final boolean zzJl()
  {
    return zzbuc == zzbua;
  }
  
  public final byte zzJm()
  {
    if (zzbuc == zzbua) {
      throw zzst.zzJs();
    }
    byte[] arrayOfByte = buffer;
    int i = zzbuc;
    zzbuc = (i + 1);
    return arrayOfByte[i];
  }
  
  public final void zza(zzsu paramzzsu)
  {
    int i = zzJf();
    if (zzbuf >= zzbug) {
      throw zzst.zzJy();
    }
    i = zzmq(i);
    zzbuf += 1;
    paramzzsu.mergeFrom(this);
    zzmn(0);
    zzbuf -= 1;
    zzmr(i);
  }
  
  public final void zza(zzsu paramzzsu, int paramInt)
  {
    if (zzbuf >= zzbug) {
      throw zzst.zzJy();
    }
    zzbuf += 1;
    paramzzsu.mergeFrom(this);
    zzmn(zzsx.zzF(paramInt, 4));
    zzbuf -= 1;
  }
  
  public final void zzmn(int paramInt)
  {
    if (zzbud != paramInt) {
      throw zzst.zzJw();
    }
  }
  
  public final boolean zzmo(int paramInt)
  {
    switch (zzsx.zzmI(paramInt))
    {
    default: 
      throw zzst.zzJx();
    case 0: 
      zzJb();
      return true;
    case 1: 
      zzJi();
      return true;
    case 2: 
      zzmu(zzJf());
      return true;
    case 3: 
      zzIY();
      zzmn(zzsx.zzF(zzsx.zzmJ(paramInt), 4));
      return true;
    case 4: 
      return false;
    }
    zzJh();
    return true;
  }
  
  public final int zzmq(int paramInt)
  {
    if (paramInt < 0) {
      throw zzst.zzJt();
    }
    paramInt = zzbuc + paramInt;
    int i = zzbue;
    if (paramInt > i) {
      throw zzst.zzJs();
    }
    zzbue = paramInt;
    zzJj();
    return i;
  }
  
  public final void zzmr(int paramInt)
  {
    zzbue = paramInt;
    zzJj();
  }
  
  public final void zzms(int paramInt)
  {
    if (paramInt > zzbuc - zzbtZ) {
      throw new IllegalArgumentException("Position " + paramInt + " is beyond current " + (zzbuc - zzbtZ));
    }
    if (paramInt < 0) {
      throw new IllegalArgumentException("Bad position " + paramInt);
    }
    zzbuc = (zzbtZ + paramInt);
  }
  
  public final byte[] zzmt(int paramInt)
  {
    if (paramInt < 0) {
      throw zzst.zzJt();
    }
    if (zzbuc + paramInt > zzbue)
    {
      zzmu(zzbue - zzbuc);
      throw zzst.zzJs();
    }
    if (paramInt <= zzbua - zzbuc)
    {
      byte[] arrayOfByte = new byte[paramInt];
      System.arraycopy(buffer, zzbuc, arrayOfByte, 0, paramInt);
      zzbuc += paramInt;
      return arrayOfByte;
    }
    throw zzst.zzJs();
  }
  
  public final void zzmu(int paramInt)
  {
    if (paramInt < 0) {
      throw zzst.zzJt();
    }
    if (zzbuc + paramInt > zzbue)
    {
      zzmu(zzbue - zzbuc);
      throw zzst.zzJs();
    }
    if (paramInt <= zzbua - zzbuc)
    {
      zzbuc += paramInt;
      return;
    }
    throw zzst.zzJs();
  }
  
  public final byte[] zzz(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return zzsx.zzbuD;
    }
    byte[] arrayOfByte = new byte[paramInt2];
    int i = zzbtZ;
    System.arraycopy(buffer, i + paramInt1, arrayOfByte, 0, paramInt2);
    return arrayOfByte;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzsm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */