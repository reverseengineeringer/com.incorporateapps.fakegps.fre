package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public final class PasswordSpecification
  implements SafeParcelable
{
  public static final zzf CREATOR = new zzf();
  public static final PasswordSpecification zzWl = new PasswordSpecification.zza().zzh(12, 16).zzbG("abcdefghijkmnopqrstxyzABCDEFGHJKLMNPQRSTXY3456789").zze("abcdefghijkmnopqrstxyz", 1).zze("ABCDEFGHJKLMNPQRSTXY", 1).zze("3456789", 1).zzmA();
  public static final PasswordSpecification zzWm = new PasswordSpecification.zza().zzh(12, 16).zzbG("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890").zze("abcdefghijklmnopqrstuvwxyz", 1).zze("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 1).zze("1234567890", 1).zzmA();
  final int mVersionCode;
  final String zzWn;
  final List zzWo;
  final List zzWp;
  final int zzWq;
  final int zzWr;
  private final int[] zzWs;
  private final Random zzuy;
  
  PasswordSpecification(int paramInt1, String paramString, List paramList1, List paramList2, int paramInt2, int paramInt3)
  {
    mVersionCode = paramInt1;
    zzWn = paramString;
    zzWo = Collections.unmodifiableList(paramList1);
    zzWp = Collections.unmodifiableList(paramList2);
    zzWq = paramInt2;
    zzWr = paramInt3;
    zzWs = zzmz();
    zzuy = new SecureRandom();
  }
  
  private int zza(char paramChar)
  {
    return paramChar - ' ';
  }
  
  private static String zzb(Collection paramCollection)
  {
    char[] arrayOfChar = new char[paramCollection.size()];
    paramCollection = paramCollection.iterator();
    int i = 0;
    while (paramCollection.hasNext())
    {
      arrayOfChar[i] = ((Character)paramCollection.next()).charValue();
      i += 1;
    }
    return new String(arrayOfChar);
  }
  
  private static boolean zzb(int paramInt1, int paramInt2, int paramInt3)
  {
    return (paramInt1 < paramInt2) || (paramInt1 > paramInt3);
  }
  
  private int[] zzmz()
  {
    int[] arrayOfInt = new int[95];
    Arrays.fill(arrayOfInt, -1);
    Iterator localIterator = zzWo.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      char[] arrayOfChar = ((String)localIterator.next()).toCharArray();
      int k = arrayOfChar.length;
      int j = 0;
      while (j < k)
      {
        arrayOfInt[zza(arrayOfChar[j])] = i;
        j += 1;
      }
      i += 1;
    }
    return arrayOfInt;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.credentials.PasswordSpecification
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */