#------------------------------
# Reviewing a PGN file
# Nolan Jacquemont - 2023
#------------------------------
# language: en
Feature: PGN Checker
  I want to check that pgn file (file used to store chess games) is complete, with white and black players name and a result

  Scenario: pgn file contains at least one valid game
    # file.pgn is a file containing a valid game and file_error.pgn is a file containing an invalid game
    Given A PGN file to review at "file_error.pgn"
    When I load PGN file data
    Then The pgn file should contain at least one valid game

  Scenario: Each game in a pgn file must contain a white player
    # file.pgn is a file containing a valid game and file_error.pgn is a file containing an invalid game
    Given A PGN file to review at "file_error.pgn"
    When I load PGN file data
    Then Each game in a pgn file should contain a white player

  Scenario: Each game in a pgn file must contain a black player
    # file.pgn is a file containing a valid game and file_error.pgn is a file containing an invalid game
    Given A PGN file to review at "file_error.pgn"
    When I load PGN file data
    Then Each game in a pgn file should contain a black player

  Scenario: Each game in a pgn file must contain a final result
    # file.pgn is a file containing a valid game and file_error.pgn is a file containing an invalid game
    Given A PGN file to review at "file_error.pgn"
    When I load PGN file data
    Then Each game in a pgn file should contain a final result