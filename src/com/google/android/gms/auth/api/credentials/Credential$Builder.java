package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import java.util.List;

public class Credential$Builder
{
  private String mName;
  private Uri zzVV;
  private List zzVW;
  private String zzVX;
  private String zzVY;
  private String zzVZ;
  private String zzWa;
  private final String zzyv;
  
  public Credential$Builder(Credential paramCredential)
  {
    zzyv = Credential.zza(paramCredential);
    mName = Credential.zzb(paramCredential);
    zzVV = Credential.zzc(paramCredential);
    zzVW = Credential.zzd(paramCredential);
    zzVX = Credential.zze(paramCredential);
    zzVY = Credential.zzf(paramCredential);
    zzVZ = Credential.zzg(paramCredential);
    zzWa = Credential.zzh(paramCredential);
  }
  
  public Credential$Builder(String paramString)
  {
    zzyv = paramString;
  }
  
  public Credential build()
  {
    return new Credential(3, zzyv, mName, zzVV, zzVW, zzVX, zzVY, zzVZ, zzWa);
  }
  
  public Builder setAccountType(String paramString)
  {
    zzVY = paramString;
    return this;
  }
  
  public Builder setName(String paramString)
  {
    mName = paramString;
    return this;
  }
  
  public Builder setPassword(String paramString)
  {
    zzVX = paramString;
    return this;
  }
  
  public Builder setProfilePictureUri(Uri paramUri)
  {
    zzVV = paramUri;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.credentials.Credential.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */