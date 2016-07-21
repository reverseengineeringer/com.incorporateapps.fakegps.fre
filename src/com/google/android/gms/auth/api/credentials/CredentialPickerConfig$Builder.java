package com.google.android.gms.auth.api.credentials;

public class CredentialPickerConfig$Builder
{
  private boolean mShowCancelButton = true;
  private boolean zzWb = false;
  private boolean zzWc = false;
  
  public CredentialPickerConfig build()
  {
    return new CredentialPickerConfig(this, null);
  }
  
  public Builder setForNewAccount(boolean paramBoolean)
  {
    zzWc = paramBoolean;
    return this;
  }
  
  public Builder setShowAddAccountButton(boolean paramBoolean)
  {
    zzWb = paramBoolean;
    return this;
  }
  
  public Builder setShowCancelButton(boolean paramBoolean)
  {
    mShowCancelButton = paramBoolean;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */