package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import java.util.ArrayList;
import java.util.List;

public class DocumentContents$zza
{
  private List zzTF;
  private String zzTG;
  private boolean zzTH;
  private Account zzTI;
  
  public zza zzL(boolean paramBoolean)
  {
    zzTH = paramBoolean;
    return this;
  }
  
  public zza zza(DocumentSection paramDocumentSection)
  {
    if (zzTF == null) {
      zzTF = new ArrayList();
    }
    zzTF.add(paramDocumentSection);
    return this;
  }
  
  public zza zzb(Account paramAccount)
  {
    zzTI = paramAccount;
    return this;
  }
  
  public zza zzbz(String paramString)
  {
    zzTG = paramString;
    return this;
  }
  
  public DocumentContents zzme()
  {
    String str = zzTG;
    boolean bool = zzTH;
    Account localAccount = zzTI;
    if (zzTF != null) {}
    for (DocumentSection[] arrayOfDocumentSection = (DocumentSection[])zzTF.toArray(new DocumentSection[zzTF.size()]);; arrayOfDocumentSection = null) {
      return new DocumentContents(str, bool, localAccount, arrayOfDocumentSection);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.appdatasearch.DocumentContents.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */