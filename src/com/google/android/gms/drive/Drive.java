package com.google.android.gms.drive;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.drive.internal.zzaa;
import com.google.android.gms.drive.internal.zzac;
import com.google.android.gms.drive.internal.zzs;
import com.google.android.gms.drive.internal.zzx;

public final class Drive
{
  public static final Api API;
  public static final DriveApi DriveApi;
  public static final DrivePreferencesApi DrivePreferencesApi = new zzaa();
  public static final Scope SCOPE_APPFOLDER;
  public static final Scope SCOPE_FILE;
  public static final Api.zzc zzUI = new Api.zzc();
  public static final Scope zzaoE;
  public static final Scope zzaoF;
  public static final Api zzaoG;
  public static final zzd zzaoH;
  public static final zzf zzaoI;
  
  static
  {
    SCOPE_FILE = new Scope("https://www.googleapis.com/auth/drive.file");
    SCOPE_APPFOLDER = new Scope("https://www.googleapis.com/auth/drive.appdata");
    zzaoE = new Scope("https://www.googleapis.com/auth/drive");
    zzaoF = new Scope("https://www.googleapis.com/auth/drive.apps");
    API = new Api("Drive.API", new Drive.1(), zzUI);
    zzaoG = new Api("Drive.INTERNAL_API", new Drive.2(), zzUI);
    DriveApi = new zzs();
    zzaoH = new zzx();
    zzaoI = new zzac();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.Drive
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */