package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.BitSet;

public class DocumentContents
  implements SafeParcelable
{
  public static final zzb CREATOR = new zzb();
  public final Account account;
  final int mVersionCode;
  final DocumentSection[] zzTC;
  public final String zzTD;
  public final boolean zzTE;
  
  DocumentContents(int paramInt, DocumentSection[] paramArrayOfDocumentSection, String paramString, boolean paramBoolean, Account paramAccount)
  {
    mVersionCode = paramInt;
    zzTC = paramArrayOfDocumentSection;
    zzTD = paramString;
    zzTE = paramBoolean;
    account = paramAccount;
  }
  
  DocumentContents(String paramString, boolean paramBoolean, Account paramAccount, DocumentSection... paramVarArgs)
  {
    this(1, paramVarArgs, paramString, paramBoolean, paramAccount);
    paramString = new BitSet(zzh.zzmg());
    int i = 0;
    while (i < paramVarArgs.length)
    {
      int j = zzTQ;
      if (j != -1)
      {
        if (paramString.get(j)) {
          throw new IllegalArgumentException("Duplicate global search section type " + zzh.zzao(j));
        }
        paramString.set(j);
      }
      i += 1;
    }
  }
  
  public int describeContents()
  {
    zzb localzzb = CREATOR;
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb localzzb = CREATOR;
    zzb.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.appdatasearch.DocumentContents
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */