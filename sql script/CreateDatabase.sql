CREATE DATABASE XChange
go

USE XChange
go

CREATE TABLE CurrencyFlags
(
CurrencyCode varchar(5) UNIQUE NOT NULL,
CurrencyFlagPath varchar(200)
)
go

CREATE UNIQUE CLUSTERED INDEX CIX_CurrencyFlags ON CurrencyFlags(CurrencyCode)
go

CREATE TABLE CurrencyValues
(
CurrencyCode varchar(5) UNIQUE NOT NULL,
ValueDate date NOT NULL,
CurrencyValue decimal(20, 4) NOT NULL
)
go

CREATE UNIQUE CLUSTERED INDEX CIX_CurrencyValues ON CurrencyValues(CurrencyCode, ValueDate)
CREATE UNIQUE NONCLUSTERED INDEX IX_CurrencyValues ON CurrencyValues(ValueDate, CurrencyCode)
go

CREATE TABLE Users
(
UserID int UNIQUE NOT NULL,
UserName varchar(50) UNIQUE NOT NULL,
UserPassword varchar(50) NOT NULL,
FirstName varchar(100),
LastName varchar(100),
MothersName varchar(100),
FavouriteColor varchar(50),
DefaultCurrencyFrom varchar(5),
DefaultCurrencyTo varchar(5),
DarkModeOn bit
)
go

CREATE UNIQUE CLUSTERED INDEX CIX_Users ON Users(UserID)
CREATE UNIQUE NONCLUSTERED INDEX IX_Users ON Users(UserName)
go

CREATE TABLE Graphs
(
UserID int NOT NULL,
GraphName varchar(50),
GraphDescription varchar(5000),
GraphImportance int,
DateCreated datetime DEFAULT GETDATE(),
CurrencyFrom varchar(5) NOT NULL,
CurrencyTo varchar(5) NOT NULL,
StartDate date NOT NULL,
EndDate date NOT NULL,
ImagePath varchar(200)
)
go

CREATE UNIQUE CLUSTERED INDEX CIX_Graphs ON Graphs(UserID, DateCreated)
go