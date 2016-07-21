package com.google.android.gms.appdatasearch;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public final class RegisterSectionInfo$zza
{
  private final String mName;
  private String zzUk;
  private boolean zzUl;
  private int zzUm;
  private boolean zzUn;
  private String zzUo;
  private final List zzUp;
  private BitSet zzUq;
  private String zzUr;
  
  public RegisterSectionInfo$zza(String paramString)
  {
    mName = paramString;
    zzUm = 1;
    zzUp = new ArrayList();
  }
  
  public final zza zzM(boolean paramBoolean)
  {
    zzUl = paramBoolean;
    return this;
  }
  
  public final zza zzN(boolean paramBoolean)
  {
    zzUn = paramBoolean;
    return this;
  }
  
  public final zza zzap(int paramInt)
  {
    if (zzUq == null) {
      zzUq = new BitSet();
    }
    zzUq.set(paramInt);
    return this;
  }
  
  public final zza zzbB(String paramString)
  {
    zzUk = paramString;
    return this;
  }
  
  public final zza zzbC(String paramString)
  {
    zzUr = paramString;
    return this;
  }
  
  public final RegisterSectionInfo zzmh()
  {
    int i = 0;
    Object localObject = null;
    if (zzUq != null)
    {
      int[] arrayOfInt = new int[zzUq.cardinality()];
      int j = zzUq.nextSetBit(0);
      for (;;)
      {
        localObject = arrayOfInt;
        if (j < 0) {
          break;
        }
        arrayOfInt[i] = j;
        j = zzUq.nextSetBit(j + 1);
        i += 1;
      }
    }
    return new RegisterSectionInfo(mName, zzUk, zzUl, zzUm, zzUn, zzUo, (Feature[])zzUp.toArray(new Feature[zzUp.size()]), (int[])localObject, zzUr);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.appdatasearch.RegisterSectionInfo.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */