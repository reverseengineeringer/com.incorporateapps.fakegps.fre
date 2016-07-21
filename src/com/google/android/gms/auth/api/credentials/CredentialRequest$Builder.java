package com.google.android.gms.auth.api.credentials;

public final class CredentialRequest$Builder
{
  private boolean zzWd;
  private String[] zzWe;
  private CredentialPickerConfig zzWf;
  private CredentialPickerConfig zzWg;
  
  public final CredentialRequest build()
  {
    if (zzWe == null) {
      zzWe = new String[0];
    }
    if ((!zzWd) && (zzWe.length == 0)) {
      throw new IllegalStateException("At least one authentication method must be specified");
    }
    return new CredentialRequest(this, null);
  }
  
  public final Builder setAccountTypes(String... paramVarArgs)
  {
    String[] arrayOfString = paramVarArgs;
    if (paramVarArgs == null) {
      arrayOfString = new String[0];
    }
    zzWe = arrayOfString;
    return this;
  }
  
  public final Builder setCredentialHintPickerConfig(CredentialPickerConfig paramCredentialPickerConfig)
  {
    zzWg = paramCredentialPickerConfig;
    return this;
  }
  
  public final Builder setCredentialPickerConfig(CredentialPickerConfig paramCredentialPickerConfig)
  {
    zzWf = paramCredentialPickerConfig;
    return this;
  }
  
  public final Builder setPasswordLoginSupported(boolean paramBoolean)
  {
    zzWd = paramBoolean;
    return this;
  }
  
  public final Builder setSupportsPasswordLogin(boolean paramBoolean)
  {
    return setPasswordLoginSupported(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.credentials.CredentialRequest.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */